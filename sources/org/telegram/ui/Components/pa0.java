package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pa0 extends org.telegram.ui.ActionBar.n2 implements jv0, mg.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 E;
    public p6 F;
    public org.telegram.ui.ActionBar.v0 G;
    public org.telegram.ui.ActionBar.v0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.f1 J;
    public org.telegram.ui.ActionBar.f1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.f1 O;
    public org.telegram.ui.ActionBar.f1 P;
    public org.telegram.ui.ActionBar.f1 Q;
    public oa0 R;
    public FrameLayout S;
    public ci.d T;
    public ci.y0 U;
    public ma0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int a;
    public final boolean[] a0;
    public iv0 b;
    public final ValueAnimator[] b0;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public FrameLayout s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.i5[] w;
    public final p6[] x;
    public ka0 y;

    public pa0(Bundle bundle, iv0 iv0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.i5[2];
        this.x = new p6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.a0 = new boolean[]{true, true};
        this.b0 = new ValueAnimator[2];
        this.b = iv0Var;
    }

    @Override // org.telegram.ui.Components.jv0
    public final void K() {
        iv0 iv0Var;
        ma0 ma0Var = this.V;
        if (ma0Var != null && (iv0Var = this.b) != null) {
            ma0Var.setNewMediaCounts(iv0Var.c);
        }
        Z();
    }

    public final void W(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void X(int i10, boolean z10, boolean z11) {
        int i11 = this.a;
        if (i11 == 3) {
            return;
        }
        if (i10 == 1 && i11 == 2) {
            return;
        }
        boolean[] zArr = this.Y;
        boolean z12 = zArr[i10];
        boolean[] zArr2 = this.a0;
        if (z12 != z10 || zArr2[i10]) {
            boolean z13 = !zArr2[i10] && z11;
            zArr2[i10] = false;
            zArr[i10] = z10;
            ValueAnimator[] valueAnimatorArr = this.b0;
            ValueAnimator valueAnimator = valueAnimatorArr[i10];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimatorArr[i10] = null;
            }
            float[] fArr = this.Z;
            p6[] p6VarArr = this.x;
            if (!z13) {
                fArr[i10] = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.i5[] i5VarArr = this.w;
                i5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                i5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                i5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                p6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                p6VarArr[i10].setVisibility(z10 ? 0 : 8);
                return;
            }
            p6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, i10, 4));
            valueAnimatorArr[i10].addListener(new na0(this, i10, z10, 0));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(tr.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Y() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.A(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i10, false), true);
        this.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.w;
        org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        boolean z10;
        ju0 ju0Var;
        ma0 ma0Var = this.V;
        if (ma0Var != null) {
            p6[] p6VarArr = this.x;
            if (p6VarArr[0] == null) {
                return;
            }
            int closestTab = ma0Var.getClosestTab();
            int i10 = this.a;
            if (i10 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z11 = LocaleController.isRTL;
                boolean z12 = !z11;
                int i11 = (i10 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        X(i11, true, true);
                        p6VarArr[i11].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z12, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                X(i11, true, true);
                                if (this.V.getPhotosVideosTypeFilter() == 1) {
                                    p6VarArr[i11].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z12, true);
                                    return;
                                } else if (this.V.getPhotosVideosTypeFilter() == 2) {
                                    p6VarArr[i11].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z12, true);
                                    return;
                                } else {
                                    p6VarArr[i11].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z12, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                X(i11, true, true);
                                p6VarArr[i11].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 2) {
                                X(i11, true, true);
                                p6VarArr[i11].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 3) {
                                X(i11, true, true);
                                p6VarArr[i11].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 4) {
                                X(i11, true, true);
                                p6VarArr[i11].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z12, true);
                                return;
                            } else if (closestTab == 5) {
                                X(i11, true, true);
                                p6VarArr[i11].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z12, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    X(i11, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    p6VarArr[i11].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z12, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.Q;
                if (f1Var != null) {
                    f1Var.setEnabled(this.V.E());
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.Q;
                    f1Var2.setAlpha(f1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = this.P;
                if (f1Var3 != null) {
                    ma0 ma0Var2 = this.V;
                    ju0[] ju0VarArr = ma0Var2.k0;
                    if (ju0VarArr != null && (ju0Var = ju0VarArr[0]) != null) {
                        boolean p02 = qv0.p0(ju0Var.F);
                        int i12 = ma0Var2.m1[p02 ? 1 : 0];
                        if (i12 != ma0Var2.X(p02 ? 1 : 0, i12, true)) {
                            z10 = true;
                            f1Var3.setEnabled(z10);
                            org.telegram.ui.ActionBar.f1 f1Var4 = this.P;
                            f1Var4.setAlpha(!f1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z10 = false;
                    f1Var3.setEnabled(z10);
                    org.telegram.ui.ActionBar.f1 f1Var42 = this.P;
                    f1Var42.setAlpha(!f1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int c02 = this.V.c0(8);
                if (c02 <= 0) {
                    X(0, false, true);
                } else if (this.a != 3) {
                    X(0, true, true);
                    p6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(p6VarArr[0].getText())) {
                    X(0, true, true);
                    p6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z12, true);
                }
                if (this.a == 1) {
                    int c03 = this.V.c0(9);
                    if (c03 > 0) {
                        X(1, true, true);
                        p6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z12, true);
                    } else {
                        X(1, false, true);
                    }
                }
                if (this.G != null) {
                    ma0 ma0Var3 = this.V;
                    boolean z13 = ma0Var3.c0(ma0Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.G.setVisibility(0);
                    }
                    this.G.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new bi.f(27, this, z13)).setDuration(220L).setInterpolator(tr.h).start();
                }
                ci.d dVar = this.T;
                if (dVar != null) {
                    boolean z14 = !z11 && this.X == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.I;
                        dVar.g(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z14, true);
                    } else {
                        dVar.g(LocaleController.getString(R.string.SaveToProfile), z14, true);
                    }
                    this.X = closestTab;
                }
                if (this.O != null) {
                    boolean z15 = this.V.c0(closestTab) > 0;
                    this.O.setEnabled(z15);
                    this.O.setAlpha(z15 ? 1.0f : 0.5f);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (this.V.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x066f  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        p6[] p6VarArr;
        org.telegram.ui.ActionBar.i5[] i5VarArr;
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        h9 h9Var;
        org.telegram.ui.ActionBar.i5 i5Var;
        ma0 ma0Var;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i11;
        ?? r10;
        int i12;
        h9 h9Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.E = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.E.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ia0(this));
        FrameLayout frameLayout = new FrameLayout(context);
        ja0 ja0Var = new ja0(this, context, frameLayout, 0);
        ja0Var.N = true;
        this.fragmentView = ja0Var;
        ja0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.a7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, w7.z5.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.i6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, n10, themedColor, getThemedColor(i15));
            this.H = v0Var2;
            v0Var2.setIcon(R.drawable.msg_delete);
            this.H.setVisibility(8);
            this.H.setAlpha(0.0f);
            this.H.setOnClickListener(new l80(n10, 2));
            frameLayout2.addView(this.H);
            org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.G = v0Var3;
            v0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ha0
                public final /* synthetic */ pa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ai.d9 d9Var;
                    ai.d9 d9Var2;
                    ai.d9 d9Var3;
                    ai.d9 d9Var4;
                    int i17;
                    int i18 = i16;
                    pa0 pa0Var = this.b;
                    switch (i18) {
                        case 0:
                            pa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = pa0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                pa0Var.Q.setEnabled(true);
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(booleanValue);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = pa0Var.V.x1(null, null);
                            if (x12 != null) {
                                pa0Var.Q.setEnabled(x12.booleanValue());
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(true);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = pa0Var.L;
                            if (z10 && !pa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = pa0Var.J;
                                int i19 = -pa0Var.N;
                                pa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = pa0Var.J;
                                boolean z11 = !z10;
                                pa0Var.L = z11;
                                f1Var2.setChecked(z11);
                                ma0 ma0Var2 = pa0Var.V;
                                boolean z12 = pa0Var.L;
                                boolean z13 = pa0Var.M;
                                yt0 yt0Var = ma0Var2.c0;
                                if (yt0Var != null && (d9Var2 = yt0Var.s) != null) {
                                    d9Var2.n = z12;
                                    d9Var2.o = z13;
                                    d9Var2.d(true);
                                }
                                ds0 ds0Var = ma0Var2.e0;
                                if (ds0Var != null && (d9Var = ds0Var.s) != null) {
                                    d9Var.n = z12;
                                    d9Var.o = z13;
                                    d9Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = pa0Var.M;
                            if (z14 && !pa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = pa0Var.K;
                                int i20 = -pa0Var.N;
                                pa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = pa0Var.K;
                                boolean z15 = !z14;
                                pa0Var.M = z15;
                                f1Var4.setChecked(z15);
                                ma0 ma0Var3 = pa0Var.V;
                                boolean z16 = pa0Var.L;
                                boolean z17 = pa0Var.M;
                                yt0 yt0Var2 = ma0Var3.c0;
                                if (yt0Var2 != null && (d9Var4 = yt0Var2.s) != null) {
                                    d9Var4.n = z16;
                                    d9Var4.o = z17;
                                    d9Var4.d(true);
                                }
                                ds0 ds0Var2 = ma0Var3.e0;
                                if (ds0Var2 != null && (d9Var3 = ds0Var2.s) != null) {
                                    d9Var3.n = z16;
                                    d9Var3.o = z17;
                                    d9Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            pa0 pa0Var2 = this.b;
                            ci.y0 y0Var = pa0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                pa0Var2.U = null;
                            }
                            rc.e();
                            boolean z18 = pa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (pa0Var2.I != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < pa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            pa0Var2.V.L(false);
                            if (z18) {
                                pa0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                pa0Var2.getMessagesController().getStoriesController().n0(pa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                pa0Var2.U = new ci.y0(pa0Var2, arrayList, z18, 20);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(pa0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(pa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), m5Var).j() : yc.a0(pa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, m5Var).j()).v = new yw(19, pa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.G.setVisibility(8);
            this.G.setAlpha(0.0f);
            frameLayout2.addView(this.G);
            org.telegram.ui.ActionBar.f1 e7 = this.G.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.P = e7;
            final int i17 = 1;
            e7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ha0
                public final /* synthetic */ pa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ai.d9 d9Var;
                    ai.d9 d9Var2;
                    ai.d9 d9Var3;
                    ai.d9 d9Var4;
                    int i172;
                    int i18 = i17;
                    pa0 pa0Var = this.b;
                    switch (i18) {
                        case 0:
                            pa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = pa0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                pa0Var.Q.setEnabled(true);
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(booleanValue);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = pa0Var.V.x1(null, null);
                            if (x12 != null) {
                                pa0Var.Q.setEnabled(x12.booleanValue());
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(true);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = pa0Var.L;
                            if (z10 && !pa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = pa0Var.J;
                                int i19 = -pa0Var.N;
                                pa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = pa0Var.J;
                                boolean z11 = !z10;
                                pa0Var.L = z11;
                                f1Var2.setChecked(z11);
                                ma0 ma0Var2 = pa0Var.V;
                                boolean z12 = pa0Var.L;
                                boolean z13 = pa0Var.M;
                                yt0 yt0Var = ma0Var2.c0;
                                if (yt0Var != null && (d9Var2 = yt0Var.s) != null) {
                                    d9Var2.n = z12;
                                    d9Var2.o = z13;
                                    d9Var2.d(true);
                                }
                                ds0 ds0Var = ma0Var2.e0;
                                if (ds0Var != null && (d9Var = ds0Var.s) != null) {
                                    d9Var.n = z12;
                                    d9Var.o = z13;
                                    d9Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = pa0Var.M;
                            if (z14 && !pa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = pa0Var.K;
                                int i20 = -pa0Var.N;
                                pa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = pa0Var.K;
                                boolean z15 = !z14;
                                pa0Var.M = z15;
                                f1Var4.setChecked(z15);
                                ma0 ma0Var3 = pa0Var.V;
                                boolean z16 = pa0Var.L;
                                boolean z17 = pa0Var.M;
                                yt0 yt0Var2 = ma0Var3.c0;
                                if (yt0Var2 != null && (d9Var4 = yt0Var2.s) != null) {
                                    d9Var4.n = z16;
                                    d9Var4.o = z17;
                                    d9Var4.d(true);
                                }
                                ds0 ds0Var2 = ma0Var3.e0;
                                if (ds0Var2 != null && (d9Var3 = ds0Var2.s) != null) {
                                    d9Var3.n = z16;
                                    d9Var3.o = z17;
                                    d9Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            pa0 pa0Var2 = this.b;
                            ci.y0 y0Var = pa0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                pa0Var2.U = null;
                            }
                            rc.e();
                            boolean z18 = pa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (pa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < pa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            pa0Var2.V.L(false);
                            if (z18) {
                                pa0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                pa0Var2.getMessagesController().getStoriesController().n0(pa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                pa0Var2.U = new ci.y0(pa0Var2, arrayList, z18, 20);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(pa0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(pa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), m5Var).j() : yc.a0(pa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, m5Var).j()).v = new yw(19, pa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f1 e10 = this.G.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.Q = e10;
            final int i18 = 2;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ha0
                public final /* synthetic */ pa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ai.d9 d9Var;
                    ai.d9 d9Var2;
                    ai.d9 d9Var3;
                    ai.d9 d9Var4;
                    int i172;
                    int i182 = i18;
                    pa0 pa0Var = this.b;
                    switch (i182) {
                        case 0:
                            pa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = pa0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                pa0Var.Q.setEnabled(true);
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(booleanValue);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = pa0Var.V.x1(null, null);
                            if (x12 != null) {
                                pa0Var.Q.setEnabled(x12.booleanValue());
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(true);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = pa0Var.L;
                            if (z10 && !pa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = pa0Var.J;
                                int i19 = -pa0Var.N;
                                pa0Var.N = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = pa0Var.J;
                                boolean z11 = !z10;
                                pa0Var.L = z11;
                                f1Var2.setChecked(z11);
                                ma0 ma0Var2 = pa0Var.V;
                                boolean z12 = pa0Var.L;
                                boolean z13 = pa0Var.M;
                                yt0 yt0Var = ma0Var2.c0;
                                if (yt0Var != null && (d9Var2 = yt0Var.s) != null) {
                                    d9Var2.n = z12;
                                    d9Var2.o = z13;
                                    d9Var2.d(true);
                                }
                                ds0 ds0Var = ma0Var2.e0;
                                if (ds0Var != null && (d9Var = ds0Var.s) != null) {
                                    d9Var.n = z12;
                                    d9Var.o = z13;
                                    d9Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = pa0Var.M;
                            if (z14 && !pa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = pa0Var.K;
                                int i20 = -pa0Var.N;
                                pa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = pa0Var.K;
                                boolean z15 = !z14;
                                pa0Var.M = z15;
                                f1Var4.setChecked(z15);
                                ma0 ma0Var3 = pa0Var.V;
                                boolean z16 = pa0Var.L;
                                boolean z17 = pa0Var.M;
                                yt0 yt0Var2 = ma0Var3.c0;
                                if (yt0Var2 != null && (d9Var4 = yt0Var2.s) != null) {
                                    d9Var4.n = z16;
                                    d9Var4.o = z17;
                                    d9Var4.d(true);
                                }
                                ds0 ds0Var2 = ma0Var3.e0;
                                if (ds0Var2 != null && (d9Var3 = ds0Var2.s) != null) {
                                    d9Var3.n = z16;
                                    d9Var3.o = z17;
                                    d9Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            pa0 pa0Var2 = this.b;
                            ci.y0 y0Var = pa0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                pa0Var2.U = null;
                            }
                            rc.e();
                            boolean z18 = pa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (pa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < pa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            pa0Var2.V.L(false);
                            if (z18) {
                                pa0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                pa0Var2.getMessagesController().getStoriesController().n0(pa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                pa0Var2.U = new ci.y0(pa0Var2, arrayList, z18, 20);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(pa0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(pa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), m5Var).j() : yc.a0(pa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, m5Var).j()).v = new yw(19, pa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f1 e11 = this.G.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.O = e11;
            e11.setEnabled(false);
            this.O.setAlpha(0.5f);
            this.G.a(-1);
            org.telegram.ui.ActionBar.v0 v0Var4 = this.G;
            org.telegram.ui.ActionBar.f1 d = v0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, v0Var4.m0);
            this.J = d;
            d.setChecked(this.L);
            final int i19 = 3;
            this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ha0
                public final /* synthetic */ pa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ai.d9 d9Var;
                    ai.d9 d9Var2;
                    ai.d9 d9Var3;
                    ai.d9 d9Var4;
                    int i172;
                    int i182 = i19;
                    pa0 pa0Var = this.b;
                    switch (i182) {
                        case 0:
                            pa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = pa0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                pa0Var.Q.setEnabled(true);
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(booleanValue);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = pa0Var.V.x1(null, null);
                            if (x12 != null) {
                                pa0Var.Q.setEnabled(x12.booleanValue());
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(true);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = pa0Var.L;
                            if (z10 && !pa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = pa0Var.J;
                                int i192 = -pa0Var.N;
                                pa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = pa0Var.J;
                                boolean z11 = !z10;
                                pa0Var.L = z11;
                                f1Var2.setChecked(z11);
                                ma0 ma0Var2 = pa0Var.V;
                                boolean z12 = pa0Var.L;
                                boolean z13 = pa0Var.M;
                                yt0 yt0Var = ma0Var2.c0;
                                if (yt0Var != null && (d9Var2 = yt0Var.s) != null) {
                                    d9Var2.n = z12;
                                    d9Var2.o = z13;
                                    d9Var2.d(true);
                                }
                                ds0 ds0Var = ma0Var2.e0;
                                if (ds0Var != null && (d9Var = ds0Var.s) != null) {
                                    d9Var.n = z12;
                                    d9Var.o = z13;
                                    d9Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = pa0Var.M;
                            if (z14 && !pa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = pa0Var.K;
                                int i20 = -pa0Var.N;
                                pa0Var.N = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = pa0Var.K;
                                boolean z15 = !z14;
                                pa0Var.M = z15;
                                f1Var4.setChecked(z15);
                                ma0 ma0Var3 = pa0Var.V;
                                boolean z16 = pa0Var.L;
                                boolean z17 = pa0Var.M;
                                yt0 yt0Var2 = ma0Var3.c0;
                                if (yt0Var2 != null && (d9Var4 = yt0Var2.s) != null) {
                                    d9Var4.n = z16;
                                    d9Var4.o = z17;
                                    d9Var4.d(true);
                                }
                                ds0 ds0Var2 = ma0Var3.e0;
                                if (ds0Var2 != null && (d9Var3 = ds0Var2.s) != null) {
                                    d9Var3.n = z16;
                                    d9Var3.o = z17;
                                    d9Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            pa0 pa0Var2 = this.b;
                            ci.y0 y0Var = pa0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                pa0Var2.U = null;
                            }
                            rc.e();
                            boolean z18 = pa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (pa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < pa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            pa0Var2.V.L(false);
                            if (z18) {
                                pa0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                pa0Var2.getMessagesController().getStoriesController().n0(pa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                pa0Var2.U = new ci.y0(pa0Var2, arrayList, z18, 20);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(pa0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(pa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), m5Var).j() : yc.a0(pa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, m5Var).j()).v = new yw(19, pa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.v0 v0Var5 = this.G;
            org.telegram.ui.ActionBar.f1 d10 = v0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, v0Var5.m0);
            this.K = d10;
            d10.setChecked(this.M);
            final int i20 = 4;
            this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ha0
                public final /* synthetic */ pa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ai.d9 d9Var;
                    ai.d9 d9Var2;
                    ai.d9 d9Var3;
                    ai.d9 d9Var4;
                    int i172;
                    int i182 = i20;
                    pa0 pa0Var = this.b;
                    switch (i182) {
                        case 0:
                            pa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = pa0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                pa0Var.Q.setEnabled(true);
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(booleanValue);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = pa0Var.V.x1(null, null);
                            if (x12 != null) {
                                pa0Var.Q.setEnabled(x12.booleanValue());
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(true);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = pa0Var.L;
                            if (z10 && !pa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = pa0Var.J;
                                int i192 = -pa0Var.N;
                                pa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = pa0Var.J;
                                boolean z11 = !z10;
                                pa0Var.L = z11;
                                f1Var2.setChecked(z11);
                                ma0 ma0Var2 = pa0Var.V;
                                boolean z12 = pa0Var.L;
                                boolean z13 = pa0Var.M;
                                yt0 yt0Var = ma0Var2.c0;
                                if (yt0Var != null && (d9Var2 = yt0Var.s) != null) {
                                    d9Var2.n = z12;
                                    d9Var2.o = z13;
                                    d9Var2.d(true);
                                }
                                ds0 ds0Var = ma0Var2.e0;
                                if (ds0Var != null && (d9Var = ds0Var.s) != null) {
                                    d9Var.n = z12;
                                    d9Var.o = z13;
                                    d9Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = pa0Var.M;
                            if (z14 && !pa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = pa0Var.K;
                                int i202 = -pa0Var.N;
                                pa0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(f1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = pa0Var.K;
                                boolean z15 = !z14;
                                pa0Var.M = z15;
                                f1Var4.setChecked(z15);
                                ma0 ma0Var3 = pa0Var.V;
                                boolean z16 = pa0Var.L;
                                boolean z17 = pa0Var.M;
                                yt0 yt0Var2 = ma0Var3.c0;
                                if (yt0Var2 != null && (d9Var4 = yt0Var2.s) != null) {
                                    d9Var4.n = z16;
                                    d9Var4.o = z17;
                                    d9Var4.d(true);
                                }
                                ds0 ds0Var2 = ma0Var3.e0;
                                if (ds0Var2 != null && (d9Var3 = ds0Var2.s) != null) {
                                    d9Var3.n = z16;
                                    d9Var3.o = z17;
                                    d9Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            pa0 pa0Var2 = this.b;
                            ci.y0 y0Var = pa0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                pa0Var2.U = null;
                            }
                            rc.e();
                            boolean z18 = pa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (pa0Var2.I != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < pa0Var2.I.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var2.I.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            pa0Var2.V.L(false);
                            if (z18) {
                                pa0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                pa0Var2.getMessagesController().getStoriesController().n0(pa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                pa0Var2.U = new ci.y0(pa0Var2, arrayList, z18, 20);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(pa0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(pa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), m5Var).j() : yc.a0(pa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, m5Var).j()).v = new yw(19, pa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        boolean z10 = this.a == 0;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        int i21 = 119;
        frameLayout.addView(frameLayout3, w7.z5.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            p6VarArr = this.x;
            i5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, w7.z5.e(-1, -1, i21));
            org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
            i5VarArr[i22] = i5Var2;
            i5Var2.setPivotX(0.0f);
            i5VarArr[i22].setPivotY(AndroidUtilities.dp(9.0f));
            i5VarArr[i22].setTextSize(18);
            i5VarArr[i22].setGravity(3);
            i5VarArr[i22].setTypeface(AndroidUtilities.bold());
            i5VarArr[i22].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            i5VarArr[i22].setScrollNonFitText(true);
            i5VarArr[i22].setImportantForAccessibility(2);
            frameLayoutArr[i22].addView(i5VarArr[i22], w7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            p6 p6Var = new p6(context, true, true, true);
            p6VarArr[i22] = p6Var;
            p6Var.b(0.4f, 320L, tr.h);
            p6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            p6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pi, false));
            frameLayoutArr[i22].addView(p6VarArr[i22], w7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        ka0 ka0Var = new ka0(context);
        this.y = ka0Var;
        ka0Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        h9 h9Var3 = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(h9Var3);
        frameLayout.addView(this.y, w7.z5.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        p6 p6Var2 = new p6(context, true, true, true);
        this.F = p6Var2;
        p6Var2.b(0.4f, 320L, tr.h);
        this.F.setTextSize(AndroidUtilities.dp(20.0f));
        this.F.setGravity(3);
        p6 p6Var3 = this.F;
        int i24 = org.telegram.ui.ActionBar.i6.G6;
        p6Var3.setTextColor(getThemedColor(i24));
        this.F.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.F, w7.z5.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            oa0 oa0Var = new oa0(context, getResourceProvider());
            this.R = oa0Var;
            oa0Var.setOnTabClick(new y2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.S = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.S.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            ci.d dVar = new ci.d(context, getResourceProvider(), true);
            this.T = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.T.setShowZero(true);
            this.T.b(0, false);
            this.T.setEnabled(false);
            final int i25 = 5;
            this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ha0
                public final /* synthetic */ pa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ai.d9 d9Var;
                    ai.d9 d9Var2;
                    ai.d9 d9Var3;
                    ai.d9 d9Var4;
                    int i172;
                    int i182 = i25;
                    pa0 pa0Var = this.b;
                    switch (i182) {
                        case 0:
                            pa0Var.G.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = pa0Var.V.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                pa0Var.Q.setEnabled(true);
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(booleanValue);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = pa0Var.V.x1(null, null);
                            if (x12 != null) {
                                pa0Var.Q.setEnabled(x12.booleanValue());
                                pa0Var.Q.animate().alpha(pa0Var.Q.isEnabled() ? 1.0f : 0.5f).start();
                                pa0Var.P.setEnabled(true);
                                pa0Var.P.animate().alpha(pa0Var.P.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = pa0Var.L;
                            if (z102 && !pa0Var.M) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = pa0Var.J;
                                int i192 = -pa0Var.N;
                                pa0Var.N = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = pa0Var.J;
                                boolean z11 = !z102;
                                pa0Var.L = z11;
                                f1Var2.setChecked(z11);
                                ma0 ma0Var2 = pa0Var.V;
                                boolean z12 = pa0Var.L;
                                boolean z13 = pa0Var.M;
                                yt0 yt0Var = ma0Var2.c0;
                                if (yt0Var != null && (d9Var2 = yt0Var.s) != null) {
                                    d9Var2.n = z12;
                                    d9Var2.o = z13;
                                    d9Var2.d(true);
                                }
                                ds0 ds0Var = ma0Var2.e0;
                                if (ds0Var != null && (d9Var = ds0Var.s) != null) {
                                    d9Var.n = z12;
                                    d9Var.o = z13;
                                    d9Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = pa0Var.M;
                            if (z14 && !pa0Var.L) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = pa0Var.K;
                                int i202 = -pa0Var.N;
                                pa0Var.N = i202;
                                AndroidUtilities.shakeViewSpring(f1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = pa0Var.K;
                                boolean z15 = !z14;
                                pa0Var.M = z15;
                                f1Var4.setChecked(z15);
                                ma0 ma0Var3 = pa0Var.V;
                                boolean z16 = pa0Var.L;
                                boolean z17 = pa0Var.M;
                                yt0 yt0Var2 = ma0Var3.c0;
                                if (yt0Var2 != null && (d9Var4 = yt0Var2.s) != null) {
                                    d9Var4.n = z16;
                                    d9Var4.o = z17;
                                    d9Var4.d(true);
                                }
                                ds0 ds0Var2 = ma0Var3.e0;
                                if (ds0Var2 != null && (d9Var3 = ds0Var2.s) != null) {
                                    d9Var3.n = z16;
                                    d9Var3.o = z17;
                                    d9Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            pa0 pa0Var2 = this.b;
                            ci.y0 y0Var = pa0Var2.U;
                            if (y0Var != null) {
                                y0Var.run();
                                pa0Var2.U = null;
                            }
                            rc.e();
                            boolean z18 = pa0Var2.V.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (pa0Var2.I != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < pa0Var2.I.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var2.I.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            pa0Var2.V.L(false);
                            if (z18) {
                                pa0Var2.V.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                pa0Var2.getMessagesController().getStoriesController().n0(pa0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                pa0Var2.U = new ci.y0(pa0Var2, arrayList, z18, 20);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(pa0Var2, zArr2, arrayList, zArr, 27);
                                (z18 ? yc.a0(pa0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), m5Var).j() : yc.a0(pa0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, m5Var).j()).v = new yw(19, pa0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.S.addView(this.T);
            this.S.setAlpha(0.0f);
            this.S.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new ci.z8(7));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.W = 11;
        }
        ma0 ma0Var2 = new ma0(this, context, this.e, this.b, this.c, this.d, this.W, this, new la0(this), getResourceProvider(), frameLayout, ja0Var);
        this.V = ma0Var2;
        ma0Var2.I0.setOpen(true);
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), PorterDuff.Mode.SRC_IN));
        }
        this.V.setPinnedToTop(true);
        this.V.getSearchItem().setTranslationY(0.0f);
        this.V.r0.setTranslationY(0.0f);
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i26 = this.a;
        if (i26 == 1 || i26 == 2) {
            ja0Var.addView(this.V, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            ja0Var.addView(this.V);
        }
        ja0Var.addView(this.actionBar);
        ja0Var.addView(frameLayout);
        ja0Var.T.add(this.V);
        if (this.a == 1) {
            X(0, false, false);
            X(1, false, false);
        }
        oa0 oa0Var2 = this.R;
        if (oa0Var2 != null) {
            i10 = -1;
            ja0Var.addView(oa0Var2, w7.z5.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.S;
        if (frameLayout6 != null) {
            ja0Var.addView(frameLayout6, w7.z5.e(i10, 64, 87));
        }
        long j3 = this.e;
        if (this.f != 0 && j3 == getUserConfig().getClientUserId()) {
            j3 = this.f;
        }
        int i27 = this.a;
        if (i27 == 3) {
            i5VarArr[0].k(this.h);
            int i28 = this.r;
            if (i28 != i10) {
                p6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            i5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j3 == UserObject.ANONYMOUS) {
                    i5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    h9 h9Var4 = h9Var3;
                    h9Var4.g(21);
                    h9Var4.p = 0.75f;
                    h9Var2 = h9Var4;
                } else {
                    h9 h9Var5 = h9Var3;
                    if (this.f == 0 || j3 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(getMessagesController(), j3);
                            h9Var2 = h9Var5;
                            if (l4 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(l4.user_id));
                                h9Var2 = h9Var5;
                                if (user3 != null) {
                                    i5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    h9Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    h9Var = h9Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
                            h9Var2 = h9Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    i5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    h9Var5.g(1);
                                    h9Var5.p = 0.8f;
                                    h9Var2 = h9Var5;
                                } else {
                                    i5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    h9Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    h9Var = h9Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                            h9Var2 = h9Var5;
                            if (chat != 0) {
                                i5VarArr[0].k(chat.title);
                                h9Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                h9Var = h9Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", h9Var, user2);
                        i5Var = i5VarArr[0];
                        if (i5Var != null && TextUtils.isEmpty(i5Var.getText())) {
                            i5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        ma0Var = this.V;
                        if (ma0Var.s0(ma0Var.k0[0].F) && this.a != 1) {
                            this.V.getSearchItem().setVisibility(0);
                        }
                        v0Var = this.V.m0;
                        if (v0Var != null) {
                            i11 = 11;
                            if (this.W != 11) {
                                v0Var.setVisibility(8);
                            }
                        } else {
                            i11 = 11;
                        }
                        if (this.V.getSearchOptionsItem() != null || this.a == 1) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                            this.V.A(!r0.s0(r0.k0[0].F), false);
                            this.V.getSearchOptionsItem().setVisibility(0);
                        }
                        ju0[] ju0VarArr = this.V.k0;
                        i12 = ju0VarArr[r10].F;
                        if ((i12 != 0 || qv0.p0(i12) || ju0VarArr[r10].F == i11) && this.a != 1) {
                            this.V.r0.setVisibility(r10);
                        } else {
                            this.V.r0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(ja0Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        Z();
                        Y();
                        if (this.a == 1 && this.W == 9) {
                            this.V.M0(9.0f);
                        }
                        return ja0Var;
                    }
                    i5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    h9Var5.g(22);
                    h9Var5.p = 0.75f;
                    h9Var2 = h9Var5;
                }
                user2 = null;
                h9Var = h9Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", h9Var, user2);
                i5Var = i5VarArr[0];
                if (i5Var != null) {
                    i5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                ma0Var = this.V;
                if (ma0Var.s0(ma0Var.k0[0].F)) {
                    this.V.getSearchItem().setVisibility(0);
                }
                v0Var = this.V.m0;
                if (v0Var != null) {
                }
                if (this.V.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                ju0[] ju0VarArr2 = this.V.k0;
                i12 = ju0VarArr2[r10].F;
                if (i12 != 0) {
                }
                this.V.r0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(ja0Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                Z();
                Y();
                if (this.a == 1) {
                    this.V.M0(9.0f);
                }
                return ja0Var;
            }
            i5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            i5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        h9Var2 = h9Var3;
        user2 = null;
        h9Var = h9Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", h9Var, user2);
        i5Var = i5VarArr[0];
        if (i5Var != null) {
        }
        ma0Var = this.V;
        if (ma0Var.s0(ma0Var.k0[0].F)) {
        }
        v0Var = this.V.m0;
        if (v0Var != null) {
        }
        if (this.V.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        ju0[] ju0VarArr22 = this.V.k0;
        i12 = ju0VarArr22[r10].F;
        if (i12 != 0) {
        }
        this.V.r0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(ja0Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        Z();
        Y();
        if (this.a == 1) {
        }
        return ja0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ma0 ma0Var = this.V;
            if (ma0Var != null) {
                ma0Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        y6 y6Var = new y6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.V.x0()) {
            return false;
        }
        ma0 ma0Var = this.V;
        return ma0Var.getSelectedTab() == ma0Var.I0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            ma0 ma0Var = this.V;
            if (!ma0Var.C1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                ma0Var.L(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i10 = this.a;
        this.W = getArguments().getInt("start_from", i10 == 2 ? 9 : i10 == 1 ? 8 : 0);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.e) && this.f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.b == null) {
            this.b = new iv0(this);
        }
        this.b.x.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        ci.y0 y0Var = this.U;
        if (y0Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(y0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ma0 ma0Var = this.V;
        if (ma0Var != null) {
            ma0Var.setPagesPaddingBottom(i13);
        }
    }

    @Override // mg.b
    public final List z() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = pg.n1.m;
        return Arrays.asList(new mg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new aq(this, 27)));
    }
}
