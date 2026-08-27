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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o90 extends org.telegram.ui.ActionBar.n2 implements au0, vf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 A;
    public j6 B;
    public org.telegram.ui.ActionBar.v0 C;
    public org.telegram.ui.ActionBar.v0 D;
    public SparseArray E;
    public org.telegram.ui.ActionBar.f1 F;
    public org.telegram.ui.ActionBar.f1 G;
    public boolean H;
    public boolean I;
    public int J;
    public org.telegram.ui.ActionBar.f1 K;
    public org.telegram.ui.ActionBar.f1 L;
    public org.telegram.ui.ActionBar.f1 M;
    public n90 N;
    public FrameLayout O;
    public lh.d P;
    public hh.t5 Q;
    public l90 R;
    public int S;
    public int T;
    public final boolean[] U;
    public final float[] V;
    public final boolean[] W;
    public final ValueAnimator[] X;
    public int a;
    public zt0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public FrameLayout s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.h5[] w;
    public final j6[] x;
    public j90 y;

    public o90(Bundle bundle, zt0 zt0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.h5[2];
        this.x = new j6[2];
        this.H = true;
        this.I = true;
        this.J = -12;
        this.U = new boolean[2];
        this.V = new float[2];
        this.W = new boolean[]{true, true};
        this.X = new ValueAnimator[2];
        this.b = zt0Var;
    }

    @Override // vf.b
    public final List C() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = yf.j1.m;
        return Arrays.asList(new vf.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new lp(this, 26)));
    }

    @Override // org.telegram.ui.Components.au0
    public final void M() {
        zt0 zt0Var;
        l90 l90Var = this.R;
        if (l90Var != null && (zt0Var = this.b) != null) {
            l90Var.setNewMediaCounts(zt0Var.c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        int i11 = this.a;
        if (i11 == 3) {
            return;
        }
        if (i10 == 1 && i11 == 2) {
            return;
        }
        boolean[] zArr = this.U;
        boolean z12 = zArr[i10];
        boolean[] zArr2 = this.W;
        if (z12 != z10 || zArr2[i10]) {
            boolean z13 = !zArr2[i10] && z11;
            zArr2[i10] = false;
            zArr[i10] = z10;
            ValueAnimator[] valueAnimatorArr = this.X;
            ValueAnimator valueAnimator = valueAnimatorArr[i10];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimatorArr[i10] = null;
            }
            float[] fArr = this.V;
            j6[] j6VarArr = this.x;
            if (!z13) {
                fArr[i10] = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.w;
                h5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                j6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                j6VarArr[i10].setVisibility(z10 ? 0 : 8);
                return;
            }
            j6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new eh.b(this, i10, 5));
            valueAnimatorArr[i10].addListener(new m90(this, i10, z10, 0));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(er.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), true);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.w;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        zs0 zs0Var;
        l90 l90Var = this.R;
        if (l90Var != null) {
            j6[] j6VarArr = this.x;
            if (j6VarArr[0] == null) {
                return;
            }
            int closestTab = l90Var.getClosestTab();
            int i10 = this.a;
            if (i10 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z11 = LocaleController.isRTL;
                boolean z12 = !z11;
                int i11 = (i10 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        Y(i11, true, true);
                        j6VarArr[i11].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z12, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                Y(i11, true, true);
                                if (this.R.getPhotosVideosTypeFilter() == 1) {
                                    j6VarArr[i11].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z12, true);
                                    return;
                                } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                                    j6VarArr[i11].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z12, true);
                                    return;
                                } else {
                                    j6VarArr[i11].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z12, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                Y(i11, true, true);
                                j6VarArr[i11].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 2) {
                                Y(i11, true, true);
                                j6VarArr[i11].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 3) {
                                Y(i11, true, true);
                                j6VarArr[i11].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 4) {
                                Y(i11, true, true);
                                j6VarArr[i11].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z12, true);
                                return;
                            } else if (closestTab == 5) {
                                Y(i11, true, true);
                                j6VarArr[i11].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z12, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    Y(i11, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    j6VarArr[i11].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z12, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.M;
                if (f1Var != null) {
                    f1Var.setEnabled(this.R.E());
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.M;
                    f1Var2.setAlpha(f1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = this.L;
                if (f1Var3 != null) {
                    l90 l90Var2 = this.R;
                    zs0[] zs0VarArr = l90Var2.g0;
                    if (zs0VarArr != null && (zs0Var = zs0VarArr[0]) != null) {
                        boolean p02 = hu0.p0(zs0Var.B);
                        int i12 = l90Var2.i1[p02 ? 1 : 0];
                        if (i12 != l90Var2.X(p02 ? 1 : 0, i12, true)) {
                            z10 = true;
                            f1Var3.setEnabled(z10);
                            org.telegram.ui.ActionBar.f1 f1Var4 = this.L;
                            f1Var4.setAlpha(!f1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z10 = false;
                    f1Var3.setEnabled(z10);
                    org.telegram.ui.ActionBar.f1 f1Var42 = this.L;
                    f1Var42.setAlpha(!f1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int c02 = this.R.c0(8);
                if (c02 <= 0) {
                    Y(0, false, true);
                } else if (this.a != 3) {
                    Y(0, true, true);
                    j6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(j6VarArr[0].getText())) {
                    Y(0, true, true);
                    j6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z12, true);
                }
                if (this.a == 1) {
                    int c03 = this.R.c0(9);
                    if (c03 > 0) {
                        Y(1, true, true);
                        j6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z12, true);
                    } else {
                        Y(1, false, true);
                    }
                }
                if (this.C != null) {
                    l90 l90Var3 = this.R;
                    boolean z13 = l90Var3.c0(l90Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.C.setVisibility(0);
                    }
                    this.C.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new f50(1, this, z13)).setDuration(220L).setInterpolator(er.h).start();
                }
                lh.d dVar = this.P;
                if (dVar != null) {
                    boolean z14 = !z11 && this.T == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.E;
                        dVar.g(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z14, true);
                    } else {
                        dVar.g(LocaleController.getString(R.string.SaveToProfile), z14, true);
                    }
                    this.T = closestTab;
                }
                if (this.K != null) {
                    boolean z15 = this.R.c0(closestTab) > 0;
                    this.K.setEnabled(z15);
                    this.K.setAlpha(z15 ? 1.0f : 0.5f);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (this.R.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0670  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        j6[] j6VarArr;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        y8 y8Var;
        org.telegram.ui.ActionBar.h5 h5Var;
        l90 l90Var;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i11;
        ?? r10;
        int i12;
        y8 y8Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.A = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.A.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new h90(this));
        FrameLayout frameLayout = new FrameLayout(context);
        i90 i90Var = new i90(this, context, frameLayout, 0);
        i90Var.J = true;
        this.fragmentView = i90Var;
        i90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, h7.z5.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.g6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, n10, themedColor, getThemedColor(i15));
            this.D = v0Var2;
            v0Var2.setIcon(R.drawable.msg_delete);
            this.D.setVisibility(8);
            this.D.setAlpha(0.0f);
            this.D.setOnClickListener(new l70(n10, 2));
            frameLayout2.addView(this.D);
            org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.C = v0Var3;
            v0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g90
                public final /* synthetic */ o90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh.j6 j6Var;
                    jh.j6 j6Var2;
                    jh.j6 j6Var3;
                    jh.j6 j6Var4;
                    int i17;
                    int i18 = i16;
                    o90 o90Var = this.b;
                    switch (i18) {
                        case 0:
                            o90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = o90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                o90Var.M.setEnabled(true);
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(booleanValue);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = o90Var.R.x1(null, null);
                            if (x12 != null) {
                                o90Var.M.setEnabled(x12.booleanValue());
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(true);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = o90Var.H;
                            if (z10 && !o90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = o90Var.F;
                                int i19 = -o90Var.J;
                                o90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = o90Var.F;
                                boolean z11 = !z10;
                                o90Var.H = z11;
                                f1Var2.setChecked(z11);
                                l90 l90Var2 = o90Var.R;
                                boolean z12 = o90Var.H;
                                boolean z13 = o90Var.I;
                                os0 os0Var = l90Var2.V;
                                if (os0Var != null && (j6Var2 = os0Var.s) != null) {
                                    j6Var2.n = z12;
                                    j6Var2.o = z13;
                                    j6Var2.d(true);
                                }
                                uq0 uq0Var = l90Var2.a0;
                                if (uq0Var != null && (j6Var = uq0Var.s) != null) {
                                    j6Var.n = z12;
                                    j6Var.o = z13;
                                    j6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = o90Var.I;
                            if (z14 && !o90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = o90Var.G;
                                int i20 = -o90Var.J;
                                o90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = o90Var.G;
                                boolean z15 = !z14;
                                o90Var.I = z15;
                                f1Var4.setChecked(z15);
                                l90 l90Var3 = o90Var.R;
                                boolean z16 = o90Var.H;
                                boolean z17 = o90Var.I;
                                os0 os0Var2 = l90Var3.V;
                                if (os0Var2 != null && (j6Var4 = os0Var2.s) != null) {
                                    j6Var4.n = z16;
                                    j6Var4.o = z17;
                                    j6Var4.d(true);
                                }
                                uq0 uq0Var2 = l90Var3.a0;
                                if (uq0Var2 != null && (j6Var3 = uq0Var2.s) != null) {
                                    j6Var3.n = z16;
                                    j6Var3.o = z17;
                                    j6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            o90 o90Var2 = this.b;
                            hh.t5 t5Var = o90Var2.Q;
                            if (t5Var != null) {
                                t5Var.run();
                                o90Var2.Q = null;
                            }
                            ec.e();
                            boolean z18 = o90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (o90Var2.E != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < o90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) o90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            o90Var2.R.L(false);
                            if (z18) {
                                o90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                o90Var2.getMessagesController().getStoriesController().n0(o90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                o90Var2.Q = new hh.t5(o90Var2, arrayList, z18, 17);
                                org.telegram.ui.yf yfVar = new org.telegram.ui.yf(o90Var2, zArr2, arrayList, zArr, 22);
                                (z18 ? mc.a0(o90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), yfVar).j() : mc.a0(o90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, yfVar).j()).v = new xq(27, o90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.C.setVisibility(8);
            this.C.setAlpha(0.0f);
            frameLayout2.addView(this.C);
            org.telegram.ui.ActionBar.f1 e9 = this.C.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.L = e9;
            final int i17 = 1;
            e9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g90
                public final /* synthetic */ o90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh.j6 j6Var;
                    jh.j6 j6Var2;
                    jh.j6 j6Var3;
                    jh.j6 j6Var4;
                    int i172;
                    int i18 = i17;
                    o90 o90Var = this.b;
                    switch (i18) {
                        case 0:
                            o90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = o90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                o90Var.M.setEnabled(true);
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(booleanValue);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = o90Var.R.x1(null, null);
                            if (x12 != null) {
                                o90Var.M.setEnabled(x12.booleanValue());
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(true);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = o90Var.H;
                            if (z10 && !o90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = o90Var.F;
                                int i19 = -o90Var.J;
                                o90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = o90Var.F;
                                boolean z11 = !z10;
                                o90Var.H = z11;
                                f1Var2.setChecked(z11);
                                l90 l90Var2 = o90Var.R;
                                boolean z12 = o90Var.H;
                                boolean z13 = o90Var.I;
                                os0 os0Var = l90Var2.V;
                                if (os0Var != null && (j6Var2 = os0Var.s) != null) {
                                    j6Var2.n = z12;
                                    j6Var2.o = z13;
                                    j6Var2.d(true);
                                }
                                uq0 uq0Var = l90Var2.a0;
                                if (uq0Var != null && (j6Var = uq0Var.s) != null) {
                                    j6Var.n = z12;
                                    j6Var.o = z13;
                                    j6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = o90Var.I;
                            if (z14 && !o90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = o90Var.G;
                                int i20 = -o90Var.J;
                                o90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = o90Var.G;
                                boolean z15 = !z14;
                                o90Var.I = z15;
                                f1Var4.setChecked(z15);
                                l90 l90Var3 = o90Var.R;
                                boolean z16 = o90Var.H;
                                boolean z17 = o90Var.I;
                                os0 os0Var2 = l90Var3.V;
                                if (os0Var2 != null && (j6Var4 = os0Var2.s) != null) {
                                    j6Var4.n = z16;
                                    j6Var4.o = z17;
                                    j6Var4.d(true);
                                }
                                uq0 uq0Var2 = l90Var3.a0;
                                if (uq0Var2 != null && (j6Var3 = uq0Var2.s) != null) {
                                    j6Var3.n = z16;
                                    j6Var3.o = z17;
                                    j6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            o90 o90Var2 = this.b;
                            hh.t5 t5Var = o90Var2.Q;
                            if (t5Var != null) {
                                t5Var.run();
                                o90Var2.Q = null;
                            }
                            ec.e();
                            boolean z18 = o90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (o90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < o90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) o90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            o90Var2.R.L(false);
                            if (z18) {
                                o90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                o90Var2.getMessagesController().getStoriesController().n0(o90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                o90Var2.Q = new hh.t5(o90Var2, arrayList, z18, 17);
                                org.telegram.ui.yf yfVar = new org.telegram.ui.yf(o90Var2, zArr2, arrayList, zArr, 22);
                                (z18 ? mc.a0(o90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), yfVar).j() : mc.a0(o90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, yfVar).j()).v = new xq(27, o90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f1 e10 = this.C.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.M = e10;
            final int i18 = 2;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g90
                public final /* synthetic */ o90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh.j6 j6Var;
                    jh.j6 j6Var2;
                    jh.j6 j6Var3;
                    jh.j6 j6Var4;
                    int i172;
                    int i182 = i18;
                    o90 o90Var = this.b;
                    switch (i182) {
                        case 0:
                            o90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = o90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                o90Var.M.setEnabled(true);
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(booleanValue);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = o90Var.R.x1(null, null);
                            if (x12 != null) {
                                o90Var.M.setEnabled(x12.booleanValue());
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(true);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = o90Var.H;
                            if (z10 && !o90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = o90Var.F;
                                int i19 = -o90Var.J;
                                o90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(f1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = o90Var.F;
                                boolean z11 = !z10;
                                o90Var.H = z11;
                                f1Var2.setChecked(z11);
                                l90 l90Var2 = o90Var.R;
                                boolean z12 = o90Var.H;
                                boolean z13 = o90Var.I;
                                os0 os0Var = l90Var2.V;
                                if (os0Var != null && (j6Var2 = os0Var.s) != null) {
                                    j6Var2.n = z12;
                                    j6Var2.o = z13;
                                    j6Var2.d(true);
                                }
                                uq0 uq0Var = l90Var2.a0;
                                if (uq0Var != null && (j6Var = uq0Var.s) != null) {
                                    j6Var.n = z12;
                                    j6Var.o = z13;
                                    j6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = o90Var.I;
                            if (z14 && !o90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = o90Var.G;
                                int i20 = -o90Var.J;
                                o90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = o90Var.G;
                                boolean z15 = !z14;
                                o90Var.I = z15;
                                f1Var4.setChecked(z15);
                                l90 l90Var3 = o90Var.R;
                                boolean z16 = o90Var.H;
                                boolean z17 = o90Var.I;
                                os0 os0Var2 = l90Var3.V;
                                if (os0Var2 != null && (j6Var4 = os0Var2.s) != null) {
                                    j6Var4.n = z16;
                                    j6Var4.o = z17;
                                    j6Var4.d(true);
                                }
                                uq0 uq0Var2 = l90Var3.a0;
                                if (uq0Var2 != null && (j6Var3 = uq0Var2.s) != null) {
                                    j6Var3.n = z16;
                                    j6Var3.o = z17;
                                    j6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            o90 o90Var2 = this.b;
                            hh.t5 t5Var = o90Var2.Q;
                            if (t5Var != null) {
                                t5Var.run();
                                o90Var2.Q = null;
                            }
                            ec.e();
                            boolean z18 = o90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (o90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < o90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) o90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            o90Var2.R.L(false);
                            if (z18) {
                                o90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                o90Var2.getMessagesController().getStoriesController().n0(o90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                o90Var2.Q = new hh.t5(o90Var2, arrayList, z18, 17);
                                org.telegram.ui.yf yfVar = new org.telegram.ui.yf(o90Var2, zArr2, arrayList, zArr, 22);
                                (z18 ? mc.a0(o90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), yfVar).j() : mc.a0(o90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, yfVar).j()).v = new xq(27, o90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f1 e11 = this.C.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.K = e11;
            e11.setEnabled(false);
            this.K.setAlpha(0.5f);
            this.C.a(-1);
            org.telegram.ui.ActionBar.v0 v0Var4 = this.C;
            org.telegram.ui.ActionBar.f1 d = v0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, v0Var4.i0);
            this.F = d;
            d.setChecked(this.H);
            final int i19 = 3;
            this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g90
                public final /* synthetic */ o90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh.j6 j6Var;
                    jh.j6 j6Var2;
                    jh.j6 j6Var3;
                    jh.j6 j6Var4;
                    int i172;
                    int i182 = i19;
                    o90 o90Var = this.b;
                    switch (i182) {
                        case 0:
                            o90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = o90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                o90Var.M.setEnabled(true);
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(booleanValue);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = o90Var.R.x1(null, null);
                            if (x12 != null) {
                                o90Var.M.setEnabled(x12.booleanValue());
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(true);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = o90Var.H;
                            if (z10 && !o90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = o90Var.F;
                                int i192 = -o90Var.J;
                                o90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = o90Var.F;
                                boolean z11 = !z10;
                                o90Var.H = z11;
                                f1Var2.setChecked(z11);
                                l90 l90Var2 = o90Var.R;
                                boolean z12 = o90Var.H;
                                boolean z13 = o90Var.I;
                                os0 os0Var = l90Var2.V;
                                if (os0Var != null && (j6Var2 = os0Var.s) != null) {
                                    j6Var2.n = z12;
                                    j6Var2.o = z13;
                                    j6Var2.d(true);
                                }
                                uq0 uq0Var = l90Var2.a0;
                                if (uq0Var != null && (j6Var = uq0Var.s) != null) {
                                    j6Var.n = z12;
                                    j6Var.o = z13;
                                    j6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = o90Var.I;
                            if (z14 && !o90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = o90Var.G;
                                int i20 = -o90Var.J;
                                o90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(f1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = o90Var.G;
                                boolean z15 = !z14;
                                o90Var.I = z15;
                                f1Var4.setChecked(z15);
                                l90 l90Var3 = o90Var.R;
                                boolean z16 = o90Var.H;
                                boolean z17 = o90Var.I;
                                os0 os0Var2 = l90Var3.V;
                                if (os0Var2 != null && (j6Var4 = os0Var2.s) != null) {
                                    j6Var4.n = z16;
                                    j6Var4.o = z17;
                                    j6Var4.d(true);
                                }
                                uq0 uq0Var2 = l90Var3.a0;
                                if (uq0Var2 != null && (j6Var3 = uq0Var2.s) != null) {
                                    j6Var3.n = z16;
                                    j6Var3.o = z17;
                                    j6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            o90 o90Var2 = this.b;
                            hh.t5 t5Var = o90Var2.Q;
                            if (t5Var != null) {
                                t5Var.run();
                                o90Var2.Q = null;
                            }
                            ec.e();
                            boolean z18 = o90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (o90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < o90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) o90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            o90Var2.R.L(false);
                            if (z18) {
                                o90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                o90Var2.getMessagesController().getStoriesController().n0(o90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                o90Var2.Q = new hh.t5(o90Var2, arrayList, z18, 17);
                                org.telegram.ui.yf yfVar = new org.telegram.ui.yf(o90Var2, zArr2, arrayList, zArr, 22);
                                (z18 ? mc.a0(o90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), yfVar).j() : mc.a0(o90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, yfVar).j()).v = new xq(27, o90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.v0 v0Var5 = this.C;
            org.telegram.ui.ActionBar.f1 d10 = v0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, v0Var5.i0);
            this.G = d10;
            d10.setChecked(this.I);
            final int i20 = 4;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g90
                public final /* synthetic */ o90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh.j6 j6Var;
                    jh.j6 j6Var2;
                    jh.j6 j6Var3;
                    jh.j6 j6Var4;
                    int i172;
                    int i182 = i20;
                    o90 o90Var = this.b;
                    switch (i182) {
                        case 0:
                            o90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = o90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                o90Var.M.setEnabled(true);
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(booleanValue);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = o90Var.R.x1(null, null);
                            if (x12 != null) {
                                o90Var.M.setEnabled(x12.booleanValue());
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(true);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = o90Var.H;
                            if (z10 && !o90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = o90Var.F;
                                int i192 = -o90Var.J;
                                o90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = o90Var.F;
                                boolean z11 = !z10;
                                o90Var.H = z11;
                                f1Var2.setChecked(z11);
                                l90 l90Var2 = o90Var.R;
                                boolean z12 = o90Var.H;
                                boolean z13 = o90Var.I;
                                os0 os0Var = l90Var2.V;
                                if (os0Var != null && (j6Var2 = os0Var.s) != null) {
                                    j6Var2.n = z12;
                                    j6Var2.o = z13;
                                    j6Var2.d(true);
                                }
                                uq0 uq0Var = l90Var2.a0;
                                if (uq0Var != null && (j6Var = uq0Var.s) != null) {
                                    j6Var.n = z12;
                                    j6Var.o = z13;
                                    j6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = o90Var.I;
                            if (z14 && !o90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = o90Var.G;
                                int i202 = -o90Var.J;
                                o90Var.J = i202;
                                AndroidUtilities.shakeViewSpring(f1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = o90Var.G;
                                boolean z15 = !z14;
                                o90Var.I = z15;
                                f1Var4.setChecked(z15);
                                l90 l90Var3 = o90Var.R;
                                boolean z16 = o90Var.H;
                                boolean z17 = o90Var.I;
                                os0 os0Var2 = l90Var3.V;
                                if (os0Var2 != null && (j6Var4 = os0Var2.s) != null) {
                                    j6Var4.n = z16;
                                    j6Var4.o = z17;
                                    j6Var4.d(true);
                                }
                                uq0 uq0Var2 = l90Var3.a0;
                                if (uq0Var2 != null && (j6Var3 = uq0Var2.s) != null) {
                                    j6Var3.n = z16;
                                    j6Var3.o = z17;
                                    j6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            o90 o90Var2 = this.b;
                            hh.t5 t5Var = o90Var2.Q;
                            if (t5Var != null) {
                                t5Var.run();
                                o90Var2.Q = null;
                            }
                            ec.e();
                            boolean z18 = o90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (o90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < o90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) o90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            o90Var2.R.L(false);
                            if (z18) {
                                o90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                o90Var2.getMessagesController().getStoriesController().n0(o90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                o90Var2.Q = new hh.t5(o90Var2, arrayList, z18, 17);
                                org.telegram.ui.yf yfVar = new org.telegram.ui.yf(o90Var2, zArr2, arrayList, zArr, 22);
                                (z18 ? mc.a0(o90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), yfVar).j() : mc.a0(o90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, yfVar).j()).v = new xq(27, o90Var2, zArr2);
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
        frameLayout.addView(frameLayout3, h7.z5.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            j6VarArr = this.x;
            h5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, h7.z5.e(-1, -1, i21));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
            h5VarArr[i22] = h5Var2;
            h5Var2.setPivotX(0.0f);
            h5VarArr[i22].setPivotY(AndroidUtilities.dp(9.0f));
            h5VarArr[i22].setTextSize(18);
            h5VarArr[i22].setGravity(3);
            h5VarArr[i22].setTypeface(AndroidUtilities.bold());
            h5VarArr[i22].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5VarArr[i22].setScrollNonFitText(true);
            h5VarArr[i22].setImportantForAccessibility(2);
            frameLayoutArr[i22].addView(h5VarArr[i22], h7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            j6 j6Var = new j6(context, true, true, true);
            j6VarArr[i22] = j6Var;
            j6Var.b(0.4f, 320L, er.h);
            j6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            j6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
            frameLayoutArr[i22].addView(j6VarArr[i22], h7.z5.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        j90 j90Var = new j90(context);
        this.y = j90Var;
        j90Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(y8Var3);
        frameLayout.addView(this.y, h7.z5.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.B = j6Var2;
        j6Var2.b(0.4f, 320L, er.h);
        this.B.setTextSize(AndroidUtilities.dp(20.0f));
        this.B.setGravity(3);
        j6 j6Var3 = this.B;
        int i24 = org.telegram.ui.ActionBar.g6.G6;
        j6Var3.setTextColor(getThemedColor(i24));
        this.B.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.B, h7.z5.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            n90 n90Var = new n90(context, getResourceProvider());
            this.N = n90Var;
            n90Var.setOnTabClick(new v2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.O = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            lh.d dVar = new lh.d(context, getResourceProvider(), true);
            this.P = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.P.setShowZero(true);
            this.P.c(0, false);
            this.P.setEnabled(false);
            final int i25 = 5;
            this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g90
                public final /* synthetic */ o90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh.j6 j6Var4;
                    jh.j6 j6Var22;
                    jh.j6 j6Var32;
                    jh.j6 j6Var42;
                    int i172;
                    int i182 = i25;
                    o90 o90Var = this.b;
                    switch (i182) {
                        case 0:
                            o90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = o90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                o90Var.M.setEnabled(true);
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(booleanValue);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = o90Var.R.x1(null, null);
                            if (x12 != null) {
                                o90Var.M.setEnabled(x12.booleanValue());
                                o90Var.M.animate().alpha(o90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                o90Var.L.setEnabled(true);
                                o90Var.L.animate().alpha(o90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = o90Var.H;
                            if (z102 && !o90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var = o90Var.F;
                                int i192 = -o90Var.J;
                                o90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(f1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var2 = o90Var.F;
                                boolean z11 = !z102;
                                o90Var.H = z11;
                                f1Var2.setChecked(z11);
                                l90 l90Var2 = o90Var.R;
                                boolean z12 = o90Var.H;
                                boolean z13 = o90Var.I;
                                os0 os0Var = l90Var2.V;
                                if (os0Var != null && (j6Var22 = os0Var.s) != null) {
                                    j6Var22.n = z12;
                                    j6Var22.o = z13;
                                    j6Var22.d(true);
                                }
                                uq0 uq0Var = l90Var2.a0;
                                if (uq0Var != null && (j6Var4 = uq0Var.s) != null) {
                                    j6Var4.n = z12;
                                    j6Var4.o = z13;
                                    j6Var4.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = o90Var.I;
                            if (z14 && !o90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.f1 f1Var3 = o90Var.G;
                                int i202 = -o90Var.J;
                                o90Var.J = i202;
                                AndroidUtilities.shakeViewSpring(f1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var4 = o90Var.G;
                                boolean z15 = !z14;
                                o90Var.I = z15;
                                f1Var4.setChecked(z15);
                                l90 l90Var3 = o90Var.R;
                                boolean z16 = o90Var.H;
                                boolean z17 = o90Var.I;
                                os0 os0Var2 = l90Var3.V;
                                if (os0Var2 != null && (j6Var42 = os0Var2.s) != null) {
                                    j6Var42.n = z16;
                                    j6Var42.o = z17;
                                    j6Var42.d(true);
                                }
                                uq0 uq0Var2 = l90Var3.a0;
                                if (uq0Var2 != null && (j6Var32 = uq0Var2.s) != null) {
                                    j6Var32.n = z16;
                                    j6Var32.o = z17;
                                    j6Var32.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            o90 o90Var2 = this.b;
                            hh.t5 t5Var = o90Var2.Q;
                            if (t5Var != null) {
                                t5Var.run();
                                o90Var2.Q = null;
                            }
                            ec.e();
                            boolean z18 = o90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (o90Var2.E != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < o90Var2.E.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) o90Var2.E.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            o90Var2.R.L(false);
                            if (z18) {
                                o90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                o90Var2.getMessagesController().getStoriesController().n0(o90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                o90Var2.Q = new hh.t5(o90Var2, arrayList, z18, 17);
                                org.telegram.ui.yf yfVar = new org.telegram.ui.yf(o90Var2, zArr2, arrayList, zArr, 22);
                                (z18 ? mc.a0(o90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), yfVar).j() : mc.a0(o90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, yfVar).j()).v = new xq(27, o90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.O.addView(this.P);
            this.O.setAlpha(0.0f);
            this.O.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new cg.w(11));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.S = 11;
        }
        l90 l90Var2 = new l90(this, context, this.e, this.b, this.c, this.d, this.S, this, new k90(this), getResourceProvider(), frameLayout, i90Var);
        this.R = l90Var2;
        l90Var2.E0.setOpen(true);
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), PorterDuff.Mode.SRC_IN));
        }
        this.R.setPinnedToTop(true);
        this.R.getSearchItem().setTranslationY(0.0f);
        this.R.n0.setTranslationY(0.0f);
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i26 = this.a;
        if (i26 == 1 || i26 == 2) {
            i90Var.addView(this.R, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            i90Var.addView(this.R);
        }
        i90Var.addView(this.actionBar);
        i90Var.addView(frameLayout);
        i90Var.P.add(this.R);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        n90 n90Var2 = this.N;
        if (n90Var2 != null) {
            i10 = -1;
            i90Var.addView(n90Var2, h7.z5.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.O;
        if (frameLayout6 != null) {
            i90Var.addView(frameLayout6, h7.z5.e(i10, 64, 87));
        }
        long j10 = this.e;
        if (this.f != 0 && j10 == getUserConfig().getClientUserId()) {
            j10 = this.f;
        }
        int i27 = this.a;
        if (i27 == 3) {
            h5VarArr[0].k(this.h);
            int i28 = this.r;
            if (i28 != i10) {
                j6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            h5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j10 == UserObject.ANONYMOUS) {
                    h5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    y8 y8Var4 = y8Var3;
                    y8Var4.g(21);
                    y8Var4.p = 0.75f;
                    y8Var2 = y8Var4;
                } else {
                    y8 y8Var5 = y8Var3;
                    if (this.f == 0 || j10 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat n11 = org.telegram.messenger.y1.n(getMessagesController(), j10);
                            y8Var2 = y8Var5;
                            if (n11 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(n11.user_id));
                                y8Var2 = y8Var5;
                                if (user3 != null) {
                                    h5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    y8Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    y8Var = y8Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            y8Var2 = y8Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    h5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    y8Var5.g(1);
                                    y8Var5.p = 0.8f;
                                    y8Var2 = y8Var5;
                                } else {
                                    h5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    y8Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    y8Var = y8Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                            y8Var2 = y8Var5;
                            if (chat != 0) {
                                h5VarArr[0].k(chat.title);
                                y8Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                y8Var = y8Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", y8Var, user2);
                        h5Var = h5VarArr[0];
                        if (h5Var != null && TextUtils.isEmpty(h5Var.getText())) {
                            h5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        l90Var = this.R;
                        if (l90Var.s0(l90Var.g0[0].B) && this.a != 1) {
                            this.R.getSearchItem().setVisibility(0);
                        }
                        v0Var = this.R.i0;
                        if (v0Var != null) {
                            i11 = 11;
                            if (this.S != 11) {
                                v0Var.setVisibility(8);
                            }
                        } else {
                            i11 = 11;
                        }
                        if (this.R.getSearchOptionsItem() != null || this.a == 1) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                            this.R.A(!r0.s0(r0.g0[0].B), false);
                            this.R.getSearchOptionsItem().setVisibility(0);
                        }
                        zs0[] zs0VarArr = this.R.g0;
                        i12 = zs0VarArr[r10].B;
                        if ((i12 != 0 || hu0.p0(i12) || zs0VarArr[r10].B == i11) && this.a != 1) {
                            this.R.n0.setVisibility(r10);
                        } else {
                            this.R.n0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(i90Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        a0();
                        Z();
                        if (this.a == 1 && this.S == 9) {
                            this.R.M0(9.0f);
                        }
                        return i90Var;
                    }
                    h5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    y8Var5.g(22);
                    y8Var5.p = 0.75f;
                    y8Var2 = y8Var5;
                }
                user2 = null;
                y8Var = y8Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", y8Var, user2);
                h5Var = h5VarArr[0];
                if (h5Var != null) {
                    h5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                l90Var = this.R;
                if (l90Var.s0(l90Var.g0[0].B)) {
                    this.R.getSearchItem().setVisibility(0);
                }
                v0Var = this.R.i0;
                if (v0Var != null) {
                }
                if (this.R.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                zs0[] zs0VarArr2 = this.R.g0;
                i12 = zs0VarArr2[r10].B;
                if (i12 != 0) {
                }
                this.R.n0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(i90Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                a0();
                Z();
                if (this.a == 1) {
                    this.R.M0(9.0f);
                }
                return i90Var;
            }
            h5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            h5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        y8Var2 = y8Var3;
        user2 = null;
        y8Var = y8Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", y8Var, user2);
        h5Var = h5VarArr[0];
        if (h5Var != null) {
        }
        l90Var = this.R;
        if (l90Var.s0(l90Var.g0[0].B)) {
        }
        v0Var = this.R.i0;
        if (v0Var != null) {
        }
        if (this.R.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        zs0[] zs0VarArr22 = this.R.g0;
        i12 = zs0VarArr22[r10].B;
        if (i12 != 0) {
        }
        this.R.n0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(i90Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        a0();
        Z();
        if (this.a == 1) {
        }
        return i90Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            l90 l90Var = this.R;
            if (l90Var != null) {
                l90Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        s6 s6Var = new s6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
            if (this.actionBar.t()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.w8, false);
            }
            if (i0.b.f(w02) > 0.699999988079071d) {
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
        if (!this.R.x0()) {
            return false;
        }
        l90 l90Var = this.R;
        return l90Var.getSelectedTab() == l90Var.E0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            l90 l90Var = this.R;
            if (!l90Var.y1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                l90Var.L(false);
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
        this.S = getArguments().getInt("start_from", i10 == 2 ? 9 : i10 == 1 ? 8 : 0);
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
            this.b = new zt0(this);
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
        hh.t5 t5Var = this.Q;
        if (t5Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(t5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        l90 l90Var = this.R;
        if (l90Var != null) {
            l90Var.setPagesPaddingBottom(i13);
        }
    }
}
