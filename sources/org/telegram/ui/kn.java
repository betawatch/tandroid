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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.ActionBar.g5 {
    public float r;
    public final /* synthetic */ sn s;

    public kn(sn snVar) {
        this.s = snVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean a() {
        return this.s.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        sn snVar = this.s;
        if (!snVar.Bc.f) {
            if (snVar.u3 != null && snVar.p1 != null) {
                View currentView = snVar.q1.getCurrentView();
                sn snVar2 = currentView instanceof un ? ((un) currentView).a : snVar;
                if (!snVar2.zc.f) {
                    snVar2.Pb(true);
                    return false;
                }
                int currentPosition = snVar.p1.a.getCurrentPosition();
                int i10 = snVar.r1;
                if (currentPosition != i10) {
                    snVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (snVar.zc.f) {
                snVar.Pb(false);
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
        sn snVar = this.s;
        snVar.O7();
        if (snVar.o3 != null || snVar.p3 != null) {
            ImageView imageView = snVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (snVar.n3) {
            snVar.I1.getAdapter().U(null, 0, null, false, true);
            snVar.n3 = false;
            snVar.j0.H("", true);
        }
        snVar.j0.setSearchFieldHint(LocaleController.getString(snVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        snVar.S2.setVisibility(0);
        ImageView imageView2 = snVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        snVar.o3 = null;
        snVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        sn snVar = this.s;
        snVar.s3 = false;
        snVar.zc();
        snVar.Mc();
        ImageView imageView = snVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = snVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (snVar.n3) {
            snVar.I1.getAdapter().U(null, 0, null, false, true);
            snVar.n3 = false;
        }
        snVar.I1.setReversed(false);
        snVar.I1.getAdapter().k0 = false;
        snVar.p7();
        snVar.o3 = null;
        snVar.p3 = null;
        snVar.u3 = null;
        snVar.j0.setSearchFieldHint(LocaleController.getString(snVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        snVar.j0.setSearchFieldCaption(null);
        snVar.Ac.a(false, true);
        snVar.Bc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = snVar.i0;
        if (xVar != null && xVar.o != null) {
            org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = snVar.i0;
            if (xVar2 != null) {
                xVar2.f(0);
                sn.S3(snVar);
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
            if (u0Var2 != null && snVar.K9) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = snVar.n0;
            if (xVar4 != null && snVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = snVar.k0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(8);
            }
        } else if (snVar.Y.i0() && TextUtils.isEmpty(snVar.Y.getSlowModeTimer()) && ((chat = snVar.e) == null || ChatObject.canSendPlain(chat))) {
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
            if (u0Var5 != null && snVar.K9) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = snVar.n0;
            if (xVar7 != null && snVar.L9) {
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
            if (xVar8 != null && snVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var8 = snVar.k0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = snVar.m0;
            if (u0Var9 != null && snVar.K9) {
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
        if (snVar.q1 != null) {
            if (snVar.p1.a.getCurrentPosition() != 0) {
                snVar.p1.a.d(0, 0);
                snVar.s1 = true;
            } else {
                snVar.q1.h.clear();
            }
        }
        int i12 = snVar.R3;
        if (i12 == 3 || i12 == 8 || ((snVar.d4 == 0 && !UserObject.isReplyUser(snVar.f)) || ((messageObject = snVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            snVar.j0.setVisibility(8);
        }
        snVar.o0 = false;
        snVar.getMediaDataController().clearFoundMessageObjects();
        if (snVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        hg.n1 n1Var = snVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        snVar.Ma();
        snVar.lc(false);
        snVar.Cc(0, true);
        snVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 0.0f);
        ofFloat.addUpdateListener(new jn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        snVar.zc.a(false, true);
        snVar.Lc();
        snVar.q3 = null;
        snVar.Mc();
        snVar.zc();
        sk skVar = snVar.o1;
        if (skVar != null) {
            skVar.d.M(new zq(2));
            skVar.h = 0L;
            snVar.o1.g(false);
        }
        ek ekVar = snVar.p1;
        if (ekVar != null) {
            ekVar.b(false);
        }
        snVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        ek ekVar;
        int i10;
        sn snVar = this.s;
        snVar.s3 = true;
        snVar.zc();
        snVar.Mc();
        if (((snVar.d4 != 0 && snVar.R3 != 3) || UserObject.isReplyUser(snVar.f)) && !snVar.dc) {
            snVar.qa(null);
        }
        if (snVar.W4) {
            snVar.saveKeyboardPositionBeforeTransition();
            if (!snVar.Pa) {
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new vi(this, 10), 500L);
            cj cjVar = snVar.g2;
            if (cjVar != null) {
                cjVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var = snVar.i2;
            if (r40Var != null) {
                r40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 1.0f);
        ofFloat.addUpdateListener(new jn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        sk skVar = snVar.o1;
        if (skVar != null) {
            skVar.g(!snVar.Pa && skVar.a() && snVar.u3 == null);
        }
        if (snVar.u3 == null || (ekVar = snVar.p1) == null) {
            return;
        }
        int currentPosition = ekVar.a.getCurrentPosition();
        int i11 = snVar.r1;
        if (currentPosition != i11) {
            snVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void o(hg.o0 o0Var) {
        sn snVar = this.s;
        sk skVar = snVar.o1;
        if (skVar != null) {
            skVar.d.M(new zq(2));
            skVar.h = 0L;
        }
        snVar.q3 = null;
        snVar.Mc();
        snVar.zc();
        snVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ei.e2 e2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        sn snVar = this.s;
        boolean z10 = false;
        snVar.Jc(0, 0, -1);
        String obj = e2Var != null ? e2Var.getText().toString() : snVar.t3;
        snVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(snVar.t3.startsWith("$") || snVar.t3.startsWith("#"))) {
            snVar.u3 = null;
            ek ekVar = snVar.p1;
            if (ekVar != null) {
                ekVar.b(false);
                snVar.Lc();
            }
            ek ekVar2 = snVar.p1;
            if (ekVar2 != null && ekVar2.a.getCurrentPosition() != 0) {
                snVar.p1.a.d(0, 0);
            }
        } else {
            snVar.P7();
            if (snVar.t3.contains("@")) {
                String str = snVar.t3;
                d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                snVar.presentFragment(new org.telegram.ui.Components.k40(str, d6Var));
                return;
            }
            if (snVar.u3 == null) {
                snVar.u3 = snVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 1.0f);
                ofFloat.addUpdateListener(new jn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                sk skVar = snVar.o1;
                if (skVar != null) {
                    if (!snVar.Pa && skVar.a() && snVar.u3 == null) {
                        z10 = true;
                    }
                    skVar.g(z10);
                }
            }
            snVar.u3 = snVar.t3;
            snVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(snVar.u3);
            snVar.t1.f.N(true);
            View currentView = snVar.q1.getCurrentView();
            if (snVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof un) {
                ((un) currentView).a.Nc(snVar.u3);
            }
            snVar.Lc();
            snVar.d2.e(true, true);
            snVar.Pb(true);
            z10 = true;
        }
        ek ekVar3 = snVar.p1;
        if (ekVar3 != null) {
            ekVar3.b(z10);
        }
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str2 = snVar.t3;
        long j10 = snVar.T5;
        long j11 = snVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, snVar.d4, snVar.o3, snVar.p3, snVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        sn snVar = this.s;
        ne.b bVar = snVar.Bc;
        if (snVar.u3 == null) {
            snVar.Pb(false);
        }
        snVar.O7();
        if (snVar.n3) {
            snVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, snVar.u6, true, true);
        } else if (snVar.o3 == null && snVar.p3 == null && snVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            snVar.T2.callOnClick();
        }
        if (snVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    snVar.P7();
                }
                bVar.a(z10, true);
                ei.h1 h1Var = snVar.q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    snVar.Pb(true);
                }
                snVar.lc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean u() {
        return this.s.u3 == null;
    }
}
