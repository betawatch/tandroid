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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.ActionBar.s0 {
    public float a;
    public final /* synthetic */ un b;

    public mn(un unVar) {
        this.b = unVar;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean a() {
        return this.b.G3 == null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean b() {
        un unVar = this.b;
        if (!unVar.Xc.f) {
            if (unVar.G3 != null && unVar.B1 != null) {
                View currentView = unVar.C1.getCurrentView();
                un unVar2 = currentView instanceof wn ? ((wn) currentView).a : unVar;
                if (!unVar2.Vc.f) {
                    unVar2.Xb(true);
                    return false;
                }
                int currentPosition = unVar.B1.a.getCurrentPosition();
                int i10 = unVar.D1;
                if (currentPosition != i10) {
                    unVar.B1.a.d(i10, i10);
                    return false;
                }
            } else if (unVar.Vc.f) {
                unVar.Xb(false);
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
        un unVar = this.b;
        unVar.S7();
        if (unVar.A3 != null || unVar.B3 != null) {
            ImageView imageView = unVar.f3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (unVar.z3) {
            unVar.U1.getAdapter().U(null, 0, null, false, true);
            unVar.z3 = false;
            unVar.j0.P("", true);
        }
        unVar.j0.setSearchFieldHint(LocaleController.getString(unVar.N9() ? R.string.SavedTagSearchHint : R.string.Search));
        unVar.e3.setVisibility(0);
        ImageView imageView2 = unVar.f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        unVar.A3 = null;
        unVar.B3 = null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        un unVar = this.b;
        unVar.E3 = false;
        unVar.Ic();
        unVar.Vc();
        ImageView imageView = unVar.e3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = unVar.f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (unVar.z3) {
            unVar.U1.getAdapter().U(null, 0, null, false, true);
            unVar.z3 = false;
        }
        unVar.U1.setReversed(false);
        unVar.U1.getAdapter().k0 = false;
        unVar.t7();
        unVar.A3 = null;
        unVar.B3 = null;
        unVar.G3 = null;
        unVar.j0.setSearchFieldHint(LocaleController.getString(unVar.N9() ? R.string.SavedTagSearchHint : R.string.Search));
        unVar.j0.setSearchFieldCaption(null);
        unVar.Wc.a(false, true);
        unVar.Xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = unVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = unVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = unVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                un.T3(unVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = unVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            yr yrVar = unVar.d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = unVar.m0;
            if (w0Var2 != null && unVar.W9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = unVar.n0;
            if (yVar4 != null && unVar.X9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = unVar.k0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (unVar.Y.h0() && TextUtils.isEmpty(unVar.Y.getSlowModeTimer()) && ((chat = unVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = unVar.h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = unVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = unVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            yr yrVar2 = unVar.d0;
            if (yrVar2 != null) {
                yrVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = unVar.m0;
            if (w0Var5 != null && unVar.W9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = unVar.n0;
            if (yVar7 != null && unVar.X9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = unVar.k0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = unVar.h0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = unVar.n0;
            if (yVar8 != null && unVar.X9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = unVar.k0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = unVar.m0;
            if (w0Var9 != null && unVar.W9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = unVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = unVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            yr yrVar3 = unVar.d0;
            if (yrVar3 != null) {
                yrVar3.b(false);
            }
        }
        if (unVar.C1 != null) {
            if (unVar.B1.a.getCurrentPosition() != 0) {
                unVar.B1.a.d(0, 0);
                unVar.E1 = true;
            } else {
                unVar.C1.h.clear();
            }
        }
        int i12 = unVar.d4;
        if (i12 == 3 || i12 == 8 || ((unVar.p4 == 0 && !UserObject.isReplyUser(unVar.f)) || ((messageObject = unVar.j4) != null && messageObject.getRepliesCount() < 10))) {
            unVar.j0.setVisibility(8);
        }
        unVar.o0 = false;
        unVar.getMediaDataController().clearFoundMessageObjects();
        if (unVar.a4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        ig.n1 n1Var = unVar.Y3;
        if (n1Var != null) {
            n1Var.l();
        }
        unVar.Ra();
        unVar.uc(false);
        unVar.Lc(0, true);
        unVar.jd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new ln(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        unVar.Vc.a(false, true);
        unVar.Uc();
        unVar.C3 = null;
        unVar.Vc();
        unVar.Ic();
        sk skVar = unVar.A1;
        if (skVar != null) {
            skVar.d.M(new ar(2));
            skVar.h = 0L;
            unVar.A1.g(false);
        }
        ek ekVar = unVar.B1;
        if (ekVar != null) {
            ekVar.b(false);
        }
        unVar.vb(false);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        ek ekVar;
        int i10;
        un unVar = this.b;
        unVar.E3 = true;
        unVar.Ic();
        unVar.Vc();
        if (((unVar.p4 != 0 && unVar.d4 != 3) || UserObject.isReplyUser(unVar.f)) && !unVar.zc) {
            unVar.va(null);
        }
        if (unVar.i5) {
            unVar.saveKeyboardPositionBeforeTransition();
            if (!unVar.bb) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ui(this, 10), 500L);
            bj bjVar = unVar.s2;
            if (bjVar != null) {
                bjVar.b(true);
            }
            org.telegram.ui.Components.t40 t40Var = unVar.u2;
            if (t40Var != null) {
                t40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new ln(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        sk skVar = unVar.A1;
        if (skVar != null) {
            skVar.g(!unVar.bb && skVar.a() && unVar.G3 == null);
        }
        if (unVar.G3 == null || (ekVar = unVar.B1) == null) {
            return;
        }
        int currentPosition = ekVar.a.getCurrentPosition();
        int i11 = unVar.D1;
        if (currentPosition != i11) {
            unVar.B1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void j(ig.p0 p0Var) {
        un unVar = this.b;
        sk skVar = unVar.A1;
        if (skVar != null) {
            skVar.d.M(new ar(2));
            skVar.h = 0L;
        }
        unVar.C3 = null;
        unVar.Vc();
        unVar.Ic();
        unVar.vb(false);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var;
        un unVar = this.b;
        boolean z10 = false;
        unVar.Sc(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : unVar.F3;
        unVar.F3 = obj;
        if (TextUtils.isEmpty(obj) || !(unVar.F3.startsWith("$") || unVar.F3.startsWith("#"))) {
            unVar.G3 = null;
            ek ekVar = unVar.B1;
            if (ekVar != null) {
                ekVar.b(false);
                unVar.Uc();
            }
            ek ekVar2 = unVar.B1;
            if (ekVar2 != null && ekVar2.a.getCurrentPosition() != 0) {
                unVar.B1.a.d(0, 0);
            }
        } else {
            unVar.T7();
            if (unVar.F3.contains("@")) {
                String str = unVar.F3;
                u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                unVar.presentFragment(new org.telegram.ui.Components.m40(str, u6Var));
                return;
            }
            if (unVar.G3 == null) {
                unVar.G3 = unVar.F3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new ln(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                sk skVar = unVar.A1;
                if (skVar != null) {
                    if (!unVar.bb && skVar.a() && unVar.G3 == null) {
                        z10 = true;
                    }
                    skVar.g(z10);
                }
            }
            unVar.G3 = unVar.F3;
            unVar.Y6(true);
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(unVar.G3);
            unVar.F1.f.O(true);
            View currentView = unVar.C1.getCurrentView();
            if (unVar.a4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof wn) {
                ((wn) currentView).a.Wc(unVar.G3);
            }
            unVar.Uc();
            unVar.p2.e(true, true);
            unVar.Xb(true);
            z10 = true;
        }
        ek ekVar3 = unVar.B1;
        if (ekVar3 != null) {
            ekVar3.b(z10);
        }
        MediaDataController mediaDataController = unVar.getMediaDataController();
        String str2 = unVar.F3;
        long j10 = unVar.f6;
        long j11 = unVar.X6;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, unVar.p4, unVar.A3, unVar.B3, unVar.C3);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        un unVar = this.b;
        oe.b bVar = unVar.Xc;
        if (unVar.G3 == null) {
            unVar.Xb(false);
        }
        unVar.S7();
        if (unVar.z3) {
            unVar.U1.getAdapter().U("@" + editText.getText().toString(), 0, unVar.G6, true, true);
        } else if (unVar.A3 == null && unVar.B3 == null && unVar.f3 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            unVar.f3.callOnClick();
        }
        if (unVar.G3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    unVar.T7();
                }
                bVar.a(z10, true);
                fi.h1 h1Var = unVar.C1;
                if (h1Var != null) {
                    h1Var.E(0);
                }
                if (z10) {
                    unVar.Xb(true);
                }
                unVar.uc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean m() {
        return this.b.G3 == null;
    }
}
