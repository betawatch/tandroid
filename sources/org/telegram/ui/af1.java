package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class af1 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public ze1 f;
    public org.telegram.ui.Components.x9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.oq s;
    public org.telegram.ui.Components.ql0 v;
    public TLRPC.TL_forumTopic w;
    public og.a x;
    public co y;

    public static af1 a0(long j3, long j10) {
        Bundle e7 = w.f.e(j3, "chat_id");
        e7.putLong("topic_id", j10);
        af1 af1Var = new af1(e7);
        af1Var.h = new org.telegram.ui.Components.x9[2];
        af1Var.n = "";
        af1Var.F = new AnimationNotificationsLocker();
        return af1Var;
    }

    public final void b0(Long l4, boolean z10) {
        org.telegram.ui.Components.x9[] x9VarArr = this.h;
        if (this.f == null || this.v == null) {
            return;
        }
        long longValue = l4 == null ? 0L : l4.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, l4.longValue());
            if (f7 != null) {
                org.telegram.ui.Components.yc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ve1(this, 0)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(10, this.currentAccount, longValue);
            q5Var.setColorFilter(org.telegram.ui.ActionBar.j6.v3);
            x9VarArr[1].setAnimatedEmojiDrawable(q5Var);
            x9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
            l80Var.a(this.n);
            this.v.b(l80Var, false);
            x9VarArr[1].setImageDrawable(this.s);
            x9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.x9 x9Var = x9VarArr[0];
        org.telegram.ui.Components.x9 x9Var2 = x9VarArr[1];
        x9VarArr[0] = x9Var2;
        x9VarArr[1] = x9Var;
        AndroidUtilities.updateViewVisibilityAnimated(x9Var2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(x9VarArr[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.x9[] x9VarArr = this.h;
        if (this.w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new we1(this));
        if (this.w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        xe1 xe1Var = new xe1(context, null);
        this.fragmentView = xe1Var;
        xe1Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        xe1Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.w;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            l4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        } else {
            l4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.x5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new l0(this, 16));
        ye1 ye1Var = new ye1(context);
        final int i11 = 0;
        ye1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ue1
            public final /* synthetic */ af1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                af1 af1Var = this.b;
                switch (i12) {
                    case 0:
                        if (af1Var.b == 0 && af1Var.w == null) {
                            og.a aVar = af1Var.x;
                            int i13 = aVar.e + 1;
                            aVar.e = i13;
                            int[] iArr = og.a.k;
                            if (i13 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i14 = iArr[aVar.e];
                            aVar.i = i14;
                            aVar.h = (int[]) og.a.l.get(i14);
                            if (org.telegram.ui.ActionBar.j6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ah.m0(9, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            af1Var.E = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = af1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            x9VarArr[i12] = x9Var;
            ye1Var.addView(x9Var, w7.x5.e(28, 28, 17));
        }
        frameLayout.addView(ye1Var, w7.x5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.j6.d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, getThemedColor(i13)));
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.w;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            ze1 ze1Var = new ze1(this, this, getParentActivity());
            this.f = ze1Var;
            ze1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, w7.x5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.oq d = og.d.d(this.E, "");
            this.x = (og.a) d.a;
            this.v = new org.telegram.ui.Components.ql0(context);
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(d, this.v, 0, 0);
            oqVar.w = true;
            this.f.setForumIconDrawable(oqVar);
            this.s = oqVar;
            org.telegram.ui.Components.ql0 ql0Var = this.v;
            org.telegram.ui.Components.x9 x9Var2 = x9VarArr[0];
            ArrayList arrayList = ql0Var.n;
            if (!arrayList.contains(x9Var2)) {
                arrayList.add(x9Var2);
            }
            org.telegram.ui.Components.ql0 ql0Var2 = this.v;
            org.telegram.ui.Components.x9 x9Var3 = x9VarArr[1];
            ArrayList arrayList2 = ql0Var2.n;
            if (!arrayList2.contains(x9Var3)) {
                arrayList2.add(x9Var3);
            }
            x9VarArr[0].setImageDrawable(this.s);
            AndroidUtilities.updateViewVisibilityAnimated(x9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(x9VarArr[1], false, 1.0f, false);
            this.x.d.add(x9VarArr[0]);
            this.x.d.add(x9VarArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ac), PorterDuff.Mode.MULTIPLY));
            ye1Var.addView(imageView, w7.x5.e(22, 22, 17));
            frameLayout2.addView(new View(context), w7.x5.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i13)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i13), getThemedColor(org.telegram.ui.ActionBar.j6.i6), 16, 16));
            final int i14 = 1;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ue1
                public final /* synthetic */ af1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i14;
                    af1 af1Var = this.b;
                    switch (i122) {
                        case 0:
                            if (af1Var.b == 0 && af1Var.w == null) {
                                og.a aVar = af1Var.x;
                                int i132 = aVar.e + 1;
                                aVar.e = i132;
                                int[] iArr = og.a.k;
                                if (i132 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i142 = iArr[aVar.e];
                                aVar.i = i142;
                                aVar.h = (int[]) og.a.l.get(i142);
                                if (org.telegram.ui.ActionBar.j6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ah.m0(9, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                af1Var.E = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = af1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, w7.x5.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, w7.x5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(e9Var, w7.x5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, w7.x5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.a, this.c);
            this.w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = og.a.k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        ze1 ze1Var = this.f;
        if (ze1Var != null) {
            ze1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.lock();
        }
    }
}
