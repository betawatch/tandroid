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
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.ActionBar.s0 {
    public float a;
    public final /* synthetic */ wn b;

    public on(wn wnVar) {
        this.b = wnVar;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean a() {
        return this.b.G3 == null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean b() {
        wn wnVar = this.b;
        if (!wnVar.bd.f) {
            if (wnVar.G3 != null && wnVar.B1 != null) {
                View currentView = wnVar.C1.getCurrentView();
                wn wnVar2 = currentView instanceof yn ? ((yn) currentView).a : wnVar;
                if (!wnVar2.Zc.f) {
                    wnVar2.bc(true);
                    return false;
                }
                int currentPosition = wnVar.B1.a.getCurrentPosition();
                int i10 = wnVar.D1;
                if (currentPosition != i10) {
                    wnVar.B1.a.d(i10, i10);
                    return false;
                }
            } else if (wnVar.Zc.f) {
                wnVar.bc(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean d() {
        return this.b.z3;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void f() {
        wn wnVar = this.b;
        wnVar.U7();
        if (wnVar.A3 != null || wnVar.B3 != null) {
            ImageView imageView = wnVar.f3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (wnVar.z3) {
            wnVar.U1.getAdapter().U(null, 0, null, false, true);
            wnVar.z3 = false;
            wnVar.j0.P("", true);
        }
        wnVar.j0.setSearchFieldHint(LocaleController.getString(wnVar.Q9() ? R.string.SavedTagSearchHint : R.string.Search));
        wnVar.e3.setVisibility(0);
        ImageView imageView2 = wnVar.f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        wnVar.A3 = null;
        wnVar.B3 = null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        wn wnVar = this.b;
        wnVar.E3 = false;
        wnVar.Mc();
        wnVar.Zc();
        ImageView imageView = wnVar.e3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = wnVar.f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (wnVar.z3) {
            wnVar.U1.getAdapter().U(null, 0, null, false, true);
            wnVar.z3 = false;
        }
        wnVar.U1.setReversed(false);
        wnVar.U1.getAdapter().k0 = false;
        wnVar.v7();
        wnVar.A3 = null;
        wnVar.B3 = null;
        wnVar.G3 = null;
        wnVar.j0.setSearchFieldHint(LocaleController.getString(wnVar.Q9() ? R.string.SavedTagSearchHint : R.string.Search));
        wnVar.j0.setSearchFieldCaption(null);
        wnVar.ad.a(false, true);
        wnVar.bd.a(false, true);
        org.telegram.ui.ActionBar.y yVar = wnVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = wnVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = wnVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                wn.U3(wnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = wnVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            as asVar = wnVar.d0;
            if (asVar != null) {
                asVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = wnVar.m0;
            if (w0Var2 != null && wnVar.aa) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = wnVar.n0;
            if (yVar4 != null && wnVar.ba) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = wnVar.k0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (wnVar.Y.g0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer()) && ((chat = wnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = wnVar.h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = wnVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = wnVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            as asVar2 = wnVar.d0;
            if (asVar2 != null) {
                asVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = wnVar.m0;
            if (w0Var5 != null && wnVar.aa) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = wnVar.n0;
            if (yVar7 != null && wnVar.ba) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = wnVar.k0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = wnVar.h0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = wnVar.n0;
            if (yVar8 != null && wnVar.ba) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = wnVar.k0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = wnVar.m0;
            if (w0Var9 != null && wnVar.aa) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = wnVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = wnVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            as asVar3 = wnVar.d0;
            if (asVar3 != null) {
                asVar3.b(false);
            }
        }
        if (wnVar.C1 != null) {
            if (wnVar.B1.a.getCurrentPosition() != 0) {
                wnVar.B1.a.d(0, 0);
                wnVar.E1 = true;
            } else {
                wnVar.C1.h.clear();
            }
        }
        int i12 = wnVar.d4;
        if (i12 == 3 || i12 == 8 || ((wnVar.p4 == 0 && !UserObject.isReplyUser(wnVar.f)) || ((messageObject = wnVar.j4) != null && messageObject.getRepliesCount() < 10))) {
            wnVar.j0.setVisibility(8);
        }
        wnVar.o0 = false;
        wnVar.getMediaDataController().clearFoundMessageObjects();
        if (wnVar.a4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        ig.n1 n1Var = wnVar.Y3;
        if (n1Var != null) {
            n1Var.l();
        }
        wnVar.Ua();
        wnVar.yc(false);
        wnVar.Pc(0, true);
        wnVar.nd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new nn(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wnVar.Zc.a(false, true);
        wnVar.Yc();
        wnVar.C3 = null;
        wnVar.Zc();
        wnVar.Mc();
        uk ukVar = wnVar.A1;
        if (ukVar != null) {
            ukVar.d.M(new cr(2));
            ukVar.h = 0L;
            wnVar.A1.g(false);
        }
        gk gkVar = wnVar.B1;
        if (gkVar != null) {
            gkVar.b(false);
        }
        wnVar.zb(false);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        gk gkVar;
        int i10;
        wn wnVar = this.b;
        wnVar.E3 = true;
        wnVar.Mc();
        wnVar.Zc();
        if (((wnVar.p4 != 0 && wnVar.d4 != 3) || UserObject.isReplyUser(wnVar.f)) && !wnVar.Dc) {
            wnVar.ya(null);
        }
        if (wnVar.i5) {
            wnVar.saveKeyboardPositionBeforeTransition();
            if (!wnVar.fb) {
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new xi(this, 10), 500L);
            ej ejVar = wnVar.s2;
            if (ejVar != null) {
                ejVar.b(true);
            }
            org.telegram.ui.Components.t40 t40Var = wnVar.u2;
            if (t40Var != null) {
                t40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new nn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        uk ukVar = wnVar.A1;
        if (ukVar != null) {
            ukVar.g(!wnVar.fb && ukVar.a() && wnVar.G3 == null);
        }
        if (wnVar.G3 == null || (gkVar = wnVar.B1) == null) {
            return;
        }
        int currentPosition = gkVar.a.getCurrentPosition();
        int i11 = wnVar.D1;
        if (currentPosition != i11) {
            wnVar.B1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void j(ig.p0 p0Var) {
        wn wnVar = this.b;
        uk ukVar = wnVar.A1;
        if (ukVar != null) {
            ukVar.d.M(new cr(2));
            ukVar.h = 0L;
        }
        wnVar.C3 = null;
        wnVar.Zc();
        wnVar.Mc();
        wnVar.zb(false);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var;
        wn wnVar = this.b;
        boolean z10 = false;
        wnVar.Wc(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : wnVar.F3;
        wnVar.F3 = obj;
        if (TextUtils.isEmpty(obj) || !(wnVar.F3.startsWith("$") || wnVar.F3.startsWith("#"))) {
            wnVar.G3 = null;
            gk gkVar = wnVar.B1;
            if (gkVar != null) {
                gkVar.b(false);
                wnVar.Yc();
            }
            gk gkVar2 = wnVar.B1;
            if (gkVar2 != null && gkVar2.a.getCurrentPosition() != 0) {
                wnVar.B1.a.d(0, 0);
            }
        } else {
            wnVar.V7();
            if (wnVar.F3.contains("@")) {
                String str = wnVar.F3;
                u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                wnVar.presentFragment(new org.telegram.ui.Components.m40(str, u6Var));
                return;
            }
            if (wnVar.G3 == null) {
                wnVar.G3 = wnVar.F3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new nn(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                uk ukVar = wnVar.A1;
                if (ukVar != null) {
                    if (!wnVar.fb && ukVar.a() && wnVar.G3 == null) {
                        z10 = true;
                    }
                    ukVar.g(z10);
                }
            }
            wnVar.G3 = wnVar.F3;
            wnVar.a7(true);
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(wnVar.G3);
            wnVar.F1.f.O(true);
            View currentView = wnVar.C1.getCurrentView();
            if (wnVar.a4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof yn) {
                ((yn) currentView).a.ad(wnVar.G3);
            }
            wnVar.Yc();
            wnVar.p2.e(true, true);
            wnVar.bc(true);
            z10 = true;
        }
        gk gkVar3 = wnVar.B1;
        if (gkVar3 != null) {
            gkVar3.b(z10);
        }
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str2 = wnVar.F3;
        long j10 = wnVar.j6;
        long j11 = wnVar.b7;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, wnVar.p4, wnVar.A3, wnVar.B3, wnVar.C3);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        wn wnVar = this.b;
        oe.b bVar = wnVar.bd;
        if (wnVar.G3 == null) {
            wnVar.bc(false);
        }
        wnVar.U7();
        if (wnVar.z3) {
            wnVar.U1.getAdapter().U("@" + editText.getText().toString(), 0, wnVar.K6, true, true);
        } else if (wnVar.A3 == null && wnVar.B3 == null && wnVar.f3 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            wnVar.f3.callOnClick();
        }
        if (wnVar.G3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    wnVar.V7();
                }
                bVar.a(z10, true);
                fi.h1 h1Var = wnVar.C1;
                if (h1Var != null) {
                    h1Var.E(0);
                }
                if (z10) {
                    wnVar.bc(true);
                }
                wnVar.yc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean m() {
        return this.b.G3 == null;
    }
}
