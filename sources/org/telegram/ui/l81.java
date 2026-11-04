package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l81 extends org.telegram.ui.ActionBar.d2 {
    public wm E;
    public int F;
    public g2.g G;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.p8 d;
    public EditTextBoldCursor e;
    public k81 f;
    public org.telegram.ui.Components.k9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.xp s;
    public org.telegram.ui.Components.bk0 w;
    public TLRPC.TL_forumTopic x;
    public rg.a y;

    public static l81 f0(long j10, long j11) {
        Bundle j12 = a1.g.j(j10, "chat_id");
        j12.putLong("topic_id", j11);
        l81 l81Var = new l81(j12);
        l81Var.h = new org.telegram.ui.Components.k9[2];
        l81Var.n = "";
        l81Var.G = new g2.g((int[]) null);
        return l81Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.x != null) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751217, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748259, null));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new g81(this));
        final int i3 = 1;
        if (this.x == null) {
            this.actionBar.q().e(1, org.telegram.messenger.bd.M0(2131751753, null));
        } else {
            this.actionBar.q().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i10, kVar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        h81 h81Var = new h81(context, null);
        this.fragmentView = h81Var;
        org.telegram.ui.ActionBar.r6.i(i10, h81Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        h81Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.x;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            n4Var.setText(org.telegram.messenger.bd.M0(2131751702, null));
        } else {
            n4Var.setText(org.telegram.messenger.bd.M0(2131751749, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.bd.M0(2131751114, null));
        org.telegram.ui.ActionBar.r6.B(this.e, org.telegram.ui.ActionBar.k6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.r6.V(this.e, org.telegram.ui.ActionBar.k6.Ie, getResourceProvider());
        this.e.setPadding(org.telegram.messenger.g0.L(0.0f), this.e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | TLObject.FLAG_14);
        frameLayout.addView(this.e, b8.mf.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new n0(this, 17));
        j81 j81Var = new j81(context, i11);
        j81Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e81
            public final /* synthetic */ l81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                l81 l81Var = this.b;
                switch (i12) {
                    case 0:
                        if (l81Var.b == 0 && l81Var.x == null) {
                            rg.a aVar = l81Var.y;
                            int i13 = aVar.e + 1;
                            aVar.e = i13;
                            int[] iArr = rg.a.k;
                            if (i13 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i14 = iArr[aVar.e];
                            aVar.i = i14;
                            aVar.h = (int[]) rg.a.l.get(i14);
                            if (org.telegram.ui.ActionBar.k6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ci.uc(27, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            l81Var.F = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.p8 p8Var = l81Var.d;
                        p8Var.setChecked(true ^ p8Var.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9VarArr[i12] = k9Var;
            j81Var.addView(k9Var, b8.mf.e(28, 28, 17));
        }
        frameLayout.addView(j81Var, b8.mf.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        Drawable f02 = org.telegram.ui.ActionBar.k6.f0(L, getThemedColor(i13));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, f02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, b8.mf.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.x;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            k81 k81Var = new k81(this, this, getParentActivity());
            this.f = k81Var;
            k81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, b8.mf.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.xp d = rg.c.d(this.F, "");
            this.y = (rg.a) d.a;
            this.w = new org.telegram.ui.Components.bk0(context);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(d, this.w, 0, 0);
            xpVar.x = true;
            this.f.setForumIconDrawable(xpVar);
            this.s = xpVar;
            org.telegram.ui.Components.bk0 bk0Var = this.w;
            org.telegram.ui.Components.k9 k9Var2 = k9VarArr[0];
            ArrayList arrayList = bk0Var.n;
            if (!arrayList.contains(k9Var2)) {
                arrayList.add(k9Var2);
            }
            org.telegram.ui.Components.bk0 bk0Var2 = this.w;
            org.telegram.ui.Components.k9 k9Var3 = k9VarArr[1];
            ArrayList arrayList2 = bk0Var2.n;
            if (!arrayList2.contains(k9Var3)) {
                arrayList2.add(k9Var3);
            }
            k9VarArr[0].setImageDrawable(this.s);
            org.telegram.messenger.g0.Z3(k9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Z3(k9VarArr[1], false, 1.0f, true, false);
            this.y.d.add(k9VarArr[0]);
            this.y.d.add(k9VarArr[1]);
        } else {
            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_filled_general);
            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            j81Var.addView(e10, b8.mf.e(22, 22, 17));
            frameLayout2.addView(new View(context), b8.mf.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.k6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i13));
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
            org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, f03, N2, null, resourceProvider2);
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.d = p8Var;
            p8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.bd.M0(2131751216, null), !this.x.hidden, false, false);
            org.telegram.ui.Cells.p8 p8Var2 = this.d;
            int themedColor = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(p8Var2, org.telegram.ui.ActionBar.k6.b0(themedColor, getThemedColor(i14), 16, 16), org.telegram.ui.ActionBar.r6.N(i13), org.telegram.ui.ActionBar.r6.N(i14), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e81
                public final /* synthetic */ l81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i3;
                    l81 l81Var = this.b;
                    switch (i122) {
                        case 0:
                            if (l81Var.b == 0 && l81Var.x == null) {
                                rg.a aVar = l81Var.y;
                                int i132 = aVar.e + 1;
                                aVar.e = i132;
                                int[] iArr = rg.a.k;
                                if (i132 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i142 = iArr[aVar.e];
                                aVar.i = i142;
                                aVar.h = (int[]) rg.a.l.get(i142);
                                if (org.telegram.ui.ActionBar.k6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ci.uc(27, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                l81Var.F = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.p8 p8Var3 = l81Var.d;
                            p8Var3.setChecked(true ^ p8Var3.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, b8.mf.e(-1, 50, org.telegram.messenger.hs.E1));
            frameLayout2.addView(frameLayout3, b8.mf.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.bd.M0(2131751215, null));
            frameLayout2.addView(y8Var, b8.mf.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, b8.mf.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.x;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z10) {
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.f == null || this.w == null) {
            return;
        }
        long longValue = l10 == null ? 0L : l10.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        int i3 = 0;
        if (!z10 && longValue != 0 && !getUserConfig().q()) {
            TLRPC.Document e10 = org.telegram.ui.Components.g5.e(this.currentAccount, l10.longValue());
            if (e10 != null) {
                org.telegram.ui.Components.fc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743874, null)), org.telegram.messenger.bd.M0(2131747041, null), new f81(this, i3)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(10, this.currentAccount, longValue);
            g5Var.setColorFilter(org.telegram.ui.ActionBar.k6.v3);
            k9VarArr[1].setAnimatedEmojiDrawable(g5Var);
            k9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(1, null);
            c70Var.a(this.n);
            this.w.b(c70Var, false);
            k9VarArr[1].setImageDrawable(this.s);
            k9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.k9 k9Var = k9VarArr[0];
        org.telegram.ui.Components.k9 k9Var2 = k9VarArr[1];
        k9VarArr[0] = k9Var2;
        k9VarArr[1] = k9Var;
        org.telegram.messenger.g0.Z3(k9Var2, true, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(k9VarArr[1], false, 0.5f, true, true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(-this.a, this.c);
            this.x = f10;
            if (f10 == null) {
                return false;
            }
            this.F = f10.icon_color;
        } else {
            this.F = rg.a.k[Math.abs(Utilities.b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        org.telegram.messenger.g0.K3(this.e);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.G.e();
        k81 k81Var = this.f;
        if (k81Var != null) {
            k81Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.G.d();
        }
    }
}
