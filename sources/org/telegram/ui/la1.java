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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class la1 extends org.telegram.ui.ActionBar.k2 {
    public un D;
    public int E;
    public e2.f F;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.s8 d;
    public EditTextBoldCursor e;
    public ka1 f;
    public org.telegram.ui.Components.g9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.eq s;
    public org.telegram.ui.Components.bl0 w;
    public TLRPC.TL_forumTopic x;
    public gg.a y;

    public static la1 e0(long j10, long j11) {
        Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "chat_id");
        k10.putLong("topic_id", j11);
        la1 la1Var = new la1(k10);
        la1Var.h = new org.telegram.ui.Components.g9[2];
        la1Var.n = "";
        la1Var.F = new e2.f(null);
        return la1Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.Components.g9[] g9VarArr = this.h;
        if (this.x != null) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751217, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748268, null));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ha1(this));
        final int i10 = 1;
        if (this.x == null) {
            this.actionBar.p().e(1, org.telegram.messenger.cd.L0(2131751753, null));
        } else {
            this.actionBar.p().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.ActionBar.a7.i(i11, lVar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        ia1 ia1Var = new ia1(context, null);
        this.fragmentView = ia1Var;
        org.telegram.ui.ActionBar.a7.i(i11, ia1Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ia1Var.addView(linearLayout);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.x;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            p4Var.setText(org.telegram.messenger.cd.L0(2131751702, null));
        } else {
            p4Var.setText(org.telegram.messenger.cd.L0(2131751749, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.cd.L0(2131751114, null));
        org.telegram.ui.ActionBar.a7.B(this.e, org.telegram.ui.ActionBar.t6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.a7.V(this.e, org.telegram.ui.ActionBar.t6.Ie, getResourceProvider());
        this.e.setPadding(org.telegram.messenger.i0.L(0.0f), this.e.getPaddingTop(), org.telegram.messenger.i0.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | TLObject.FLAG_14);
        frameLayout.addView(this.e, w7.b6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new n0(this, 17));
        ja1 ja1Var = new ja1(context, i12);
        ja1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fa1
            public final /* synthetic */ la1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                la1 la1Var = this.b;
                switch (i13) {
                    case 0:
                        if (la1Var.b == 0 && la1Var.x == null) {
                            gg.a aVar = la1Var.y;
                            int i14 = aVar.e + 1;
                            aVar.e = i14;
                            int[] iArr = gg.a.k;
                            if (i14 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i15 = iArr[aVar.e];
                            aVar.i = i15;
                            aVar.h = (int[]) gg.a.l.get(i15);
                            if (org.telegram.ui.ActionBar.t6.I.q()) {
                                aVar.h = new int[]{i0.b.f(0.2f, aVar.h[0], -1), i0.b.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ag.p2(6, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            la1Var.E = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s8 s8Var = la1Var.d;
                        s8Var.setChecked(true ^ s8Var.d.h);
                        break;
                }
            }
        });
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9VarArr[i13] = g9Var;
            ja1Var.addView(g9Var, w7.b6.e(28, 28, 17));
        }
        frameLayout.addView(ja1Var, w7.b6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(p4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.t6.d6;
        Drawable f02 = org.telegram.ui.ActionBar.t6.f0(L, getThemedColor(i14));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.a7.k(linearLayout2, f02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, w7.b6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.x;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            ka1 ka1Var = new ka1(this, this, getParentActivity());
            this.f = ka1Var;
            ka1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, w7.b6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.eq d = gg.e.d(this.E, "");
            this.y = (gg.a) d.a;
            this.w = new org.telegram.ui.Components.bl0(context);
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(d, this.w, 0, 0);
            eqVar.x = true;
            this.f.setForumIconDrawable(eqVar);
            this.s = eqVar;
            org.telegram.ui.Components.bl0 bl0Var = this.w;
            org.telegram.ui.Components.g9 g9Var2 = g9VarArr[0];
            ArrayList arrayList = bl0Var.n;
            if (!arrayList.contains(g9Var2)) {
                arrayList.add(g9Var2);
            }
            org.telegram.ui.Components.bl0 bl0Var2 = this.w;
            org.telegram.ui.Components.g9 g9Var3 = g9VarArr[1];
            ArrayList arrayList2 = bl0Var2.n;
            if (!arrayList2.contains(g9Var3)) {
                arrayList2.add(g9Var3);
            }
            g9VarArr[0].setImageDrawable(this.s);
            org.telegram.messenger.i0.Y3(g9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.i0.Y3(g9VarArr[1], false, 1.0f, true, false);
            this.y.d.add(g9VarArr[0]);
            this.y.d.add(g9VarArr[1]);
        } else {
            ImageView e = org.telegram.messenger.z20.e(context, R.drawable.msg_filled_general);
            org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ja1Var.addView(e, w7.b6.e(22, 22, 17));
            frameLayout2.addView(new View(context), w7.b6.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.t6.f0(org.telegram.messenger.i0.L(16.0f), getThemedColor(i14));
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
            org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.a7.k(frameLayout3, f03, N2, null, resourceProvider2);
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.d = s8Var;
            s8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.cd.L0(2131751216, null), !this.x.hidden, false, false);
            org.telegram.ui.Cells.s8 s8Var2 = this.d;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.R(s8Var2, org.telegram.ui.ActionBar.t6.b0(themedColor, getThemedColor(i15), 16, 16), org.telegram.ui.ActionBar.a7.N(i14), org.telegram.ui.ActionBar.a7.N(i15), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fa1
                public final /* synthetic */ la1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i10;
                    la1 la1Var = this.b;
                    switch (i132) {
                        case 0:
                            if (la1Var.b == 0 && la1Var.x == null) {
                                gg.a aVar = la1Var.y;
                                int i142 = aVar.e + 1;
                                aVar.e = i142;
                                int[] iArr = gg.a.k;
                                if (i142 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i152 = iArr[aVar.e];
                                aVar.i = i152;
                                aVar.h = (int[]) gg.a.l.get(i152);
                                if (org.telegram.ui.ActionBar.t6.I.q()) {
                                    aVar.h = new int[]{i0.b.f(0.2f, aVar.h[0], -1), i0.b.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ag.p2(6, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                la1Var.E = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.s8 s8Var3 = la1Var.d;
                            s8Var3.setChecked(true ^ s8Var3.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, w7.b6.e(-1, 50, org.telegram.messenger.zs.E1));
            frameLayout2.addView(frameLayout3, w7.b6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(org.telegram.messenger.cd.L0(2131751215, null));
            frameLayout2.addView(b9Var, w7.b6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, w7.b6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.x;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            f0(Long.valueOf(this.x.icon_emoji_id), true);
        } else {
            f0(0L, true);
        }
        return this.fragmentView;
    }

    public final void f0(Long l4, boolean z10) {
        org.telegram.ui.Components.g9[] g9VarArr = this.h;
        if (this.f == null || this.w == null) {
            return;
        }
        long longValue = l4 == null ? 0L : l4.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        int i10 = 0;
        if (!z10 && longValue != 0 && !getUserConfig().q()) {
            TLRPC.Document e = org.telegram.ui.Components.f5.e(this.currentAccount, l4.longValue());
            if (e != null) {
                org.telegram.ui.Components.cc.a0(this).r(e, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743889, null)), org.telegram.messenger.cd.L0(2131747048, null), new ga1(this, i10)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(10, this.currentAccount, longValue);
            f5Var.setColorFilter(org.telegram.ui.ActionBar.t6.v3);
            g9VarArr[1].setAnimatedEmojiDrawable(f5Var);
            g9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(1, null);
            z70Var.a(this.n);
            this.w.b(z70Var, false);
            g9VarArr[1].setImageDrawable(this.s);
            g9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.g9 g9Var = g9VarArr[0];
        org.telegram.ui.Components.g9 g9Var2 = g9VarArr[1];
        g9VarArr[0] = g9Var2;
        g9VarArr[1] = g9Var;
        org.telegram.messenger.i0.Y3(g9Var2, true, 0.5f, true, true);
        org.telegram.messenger.i0.Y3(g9VarArr[1], false, 0.5f, true, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic f7 = getMessagesController().r7.f(-this.a, this.c);
            this.x = f7;
            if (f7 == null) {
                return false;
            }
            this.E = f7.icon_color;
        } else {
            this.E = gg.a.k[Math.abs(Utilities.b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        org.telegram.messenger.i0.J3(this.e);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.F.e();
        ka1 ka1Var = this.f;
        if (ka1Var != null) {
            ka1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.d();
        }
    }
}
