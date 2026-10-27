package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fb0 extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Cells.q4 E;
    public ab0 F;
    public org.telegram.ui.Cells.i9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ga I;
    public org.telegram.ui.Components.hp0 J;
    public ab0 K;
    public org.telegram.ui.Cells.i9 L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final int[] P;
    public final ArrayList Q;
    public final int[] R;
    public eb0 S;
    public org.telegram.ui.ActionBar.e2 T;
    public boolean U;
    public int V;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.ax0 c;
    public org.telegram.ui.Components.ax0 d;
    public TLRPC.TL_chatInviteExported e;
    public cb0 f;
    public org.telegram.ui.Cells.i9 h;
    public org.telegram.ui.Cells.a9 n;
    public db0 r;
    public TextView s;
    public org.telegram.ui.Cells.i9 v;
    public TextView w;
    public org.telegram.ui.Cells.q4 x;
    public org.telegram.ui.Cells.i9 y;

    public fb0(int i10, long j10) {
        super(null);
        this.M = -3;
        this.O = new ArrayList();
        this.P = new int[]{3600, 86400, 604800};
        this.Q = new ArrayList();
        this.R = new int[]{1, 10, 100};
        this.a = i10;
        this.b = j10;
    }

    public final void W(int i10) {
        int[] iArr;
        long j10 = i10;
        this.w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.P;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = c3.h0.i(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i14] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j11 < 31449600) {
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(1000 * j10);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(1000 * j10);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void X(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.R;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = c3.h0.i(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.c.b(i13, null, strArr);
    }

    public final void Y() {
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.R;
            if (i10 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            i10 = c3.h0.i(iArr[i10], i10, 1, arrayList);
        }
    }

    public final void Z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i10 = tL_chatInviteExported.expire_date;
        if (i10 > 0) {
            W(i10);
            this.V = ((Integer) this.O.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.V = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            X(i11);
            this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        cb0 cb0Var = this.f;
        if (cb0Var != null) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, cb0Var, null);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        a0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
            this.K.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.a9 a9Var = this.n;
        if (a9Var != null) {
            a9Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            cb0 cb0Var2 = this.f;
            if (cb0Var2 != null) {
                cb0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.i9 i9Var = this.h;
            if (i9Var != null) {
                i9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        db0 db0Var = this.r;
        if (db0Var != null) {
            db0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    public final void a0(boolean z10) {
        this.E.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.F.setVisibility(z10 ? 0 : 8);
        this.G.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.a;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 8));
        this.simpleActionBar.i(LocaleController.getString(i10 == 0 ? R.string.Create : R.string.Save));
        za0 za0Var = new za0(this, context);
        org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(context, za0Var, this.resourceProvider, true);
        this.J = hp0Var;
        hp0Var.setDrawBackground(true);
        this.J.setOverScrollMode(0);
        a9 a9Var = new a9(this, context, 4);
        this.fragmentView = a9Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        layoutTransition.setInterpolator(2, dsVar);
        layoutTransition.setInterpolator(0, dsVar);
        layoutTransition.setInterpolator(4, dsVar);
        layoutTransition.setInterpolator(1, dsVar);
        int i11 = 3;
        layoutTransition.setInterpolator(3, dsVar);
        za0Var.setLayoutTransition(layoutTransition);
        za0Var.setOrientation(1);
        za0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(za0Var);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        this.x = q4Var;
        q4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        za0Var.addView(this.x);
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, null);
        this.d = ax0Var;
        za0Var.addView(ax0Var);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new org.telegram.ui.Components.l51(25, this, context));
        this.d.setCallback(new va0(this, 2));
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = c3.h0.i(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        za0Var.addView(this.w, org.telegram.ui.Components.kb1.r(-1, 50));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.y = i9Var;
        i9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        za0Var.addView(this.y);
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context);
        this.E = q4Var2;
        q4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        za0Var.addView(this.E);
        org.telegram.ui.Components.ax0 ax0Var2 = new org.telegram.ui.Components.ax0(context, null);
        this.c = ax0Var2;
        ax0Var2.setCallback(new va0(this, i11));
        Y();
        za0Var.addView(this.c);
        ab0 ab0Var = new ab0(context, 0);
        this.F = ab0Var;
        ab0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new bb0(this, 0));
        za0Var.addView(this.F, org.telegram.ui.Components.kb1.r(-1, 50));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.G = i9Var2;
        i9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        za0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        cb0 cb0Var = new cb0(context);
        this.f = cb0Var;
        int i13 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i13, cb0Var, null);
        this.f.setTag(Integer.valueOf(i13));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new di.g2(7, this, z10));
        za0Var.addView(this.f, org.telegram.ui.Components.kb1.r(-1, 56));
        org.telegram.ui.Cells.i9 i9Var3 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.h = i9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            i9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        za0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
                this.n = a9Var2;
                org.telegram.ui.ActionBar.f7.i(i13, a9Var2, null);
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new org.telegram.ui.Components.l51(26, this, new Runnable[1]));
                za0Var.addView(this.n, org.telegram.ui.Components.kb1.r(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(this.s, org.telegram.ui.ActionBar.y6.A6, null);
                db0 db0Var = new db0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = db0Var;
                db0Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.f7.i(i13, this.r, getResourceProvider());
                db0 db0Var2 = this.r;
                db0Var2.getClass();
                db0Var2.d(new org.telegram.ui.Cells.g(db0Var2, 4));
                this.r.addView(this.s, org.telegram.ui.Components.kb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                db0 db0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                db0Var3.getClass();
                ImageView imageView = new ImageView(db0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                db0Var3.addView(imageView, org.telegram.ui.Components.kb1.h(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.e3 e3Var = db0Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                e3Var.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                za0Var.addView(this.r, org.telegram.ui.Components.kb1.r(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.i9 i9Var4 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
                this.v = i9Var4;
                if (this.e != null) {
                    i9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    i9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new ya0(this, 0)));
                }
                za0Var.addView(this.v, org.telegram.ui.Components.kb1.r(-1, -2));
            }
        }
        ab0 ab0Var2 = new ab0(context, 1);
        this.K = ab0Var2;
        ab0Var2.addTextChangedListener(new bb0(this, 1));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        ab0 ab0Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.E(ab0Var3, i14, null);
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        ab0 ab0Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(ab0Var4, i15, null);
        this.K.setTextSize(1, 16.0f);
        za0Var.addView(this.K, org.telegram.ui.Components.kb1.r(-1, 50));
        org.telegram.ui.Cells.i9 i9Var5 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.L = i9Var5;
        i9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        za0Var.addView(this.L);
        if (i10 == 1) {
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
            this.I = gaVar;
            org.telegram.ui.ActionBar.f7.i(i13, gaVar, null);
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            org.telegram.ui.ActionBar.f7.V(this.I.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
            this.I.setOnClickListener(new z50(this, 6));
            za0Var.addView(this.I);
        }
        a9Var.addView(this.J, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout, getResourceProvider());
        new fi.z3(a9Var, false, new di.e(17));
        a9Var.addView(this.H, org.telegram.ui.Components.kb1.i(-1, -2, 80));
        org.telegram.ui.ActionBar.f7.i(i13, this.x, null);
        org.telegram.ui.ActionBar.f7.i(i13, this.d, null);
        org.telegram.ui.ActionBar.f7.i(i13, this.w, null);
        org.telegram.ui.ActionBar.f7.i(i13, this.E, null);
        org.telegram.ui.ActionBar.f7.i(i13, this.c, null);
        org.telegram.ui.ActionBar.f7.i(i13, this.F, null);
        org.telegram.ui.ActionBar.f7.i(i13, this.K, null);
        org.telegram.ui.ActionBar.f7.V(this.F, i15, null);
        org.telegram.ui.ActionBar.f7.E(this.F, i14, null);
        org.telegram.ui.ActionBar.f7.V(this.w, i15, null);
        org.telegram.ui.ActionBar.f7.E(this.w, i14, null);
        this.F.setCursorVisible(false);
        Z(this.e);
        a9Var.setClipChildren(false);
        this.J.setClipChildren(false);
        za0Var.setClipChildren(false);
        return a9Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.hp0 getScrollViewForSimpleGlass() {
        return this.J;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
