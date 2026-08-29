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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y90 extends org.telegram.ui.ActionBar.o2 implements ju0, xf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.h2 A;
    public o6 B;
    public org.telegram.ui.ActionBar.w0 C;
    public org.telegram.ui.ActionBar.w0 D;
    public SparseArray E;
    public org.telegram.ui.ActionBar.g1 F;
    public org.telegram.ui.ActionBar.g1 G;
    public boolean H;
    public boolean I;
    public int J;
    public org.telegram.ui.ActionBar.g1 K;
    public org.telegram.ui.ActionBar.g1 L;
    public org.telegram.ui.ActionBar.g1 M;
    public x90 N;
    public FrameLayout O;
    public nh.d P;
    public jh.r5 Q;
    public v90 R;
    public int S;
    public int T;
    public final boolean[] U;
    public final float[] V;
    public final boolean[] W;
    public final ValueAnimator[] X;
    public int a;
    public iu0 b;
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
    public final o6[] x;
    public t90 y;

    public y90(Bundle bundle, iu0 iu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.w = new org.telegram.ui.ActionBar.h5[2];
        this.x = new o6[2];
        this.H = true;
        this.I = true;
        this.J = -12;
        this.U = new boolean[2];
        this.V = new float[2];
        this.W = new boolean[]{true, true};
        this.X = new ValueAnimator[2];
        this.b = iu0Var;
    }

    @Override // xf.b
    public final List B() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = ag.d2.m;
        return Arrays.asList(new xf.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new rp(this, 26)));
    }

    @Override // org.telegram.ui.Components.ju0
    public final void L() {
        iu0 iu0Var;
        v90 v90Var = this.R;
        if (v90Var != null && (iu0Var = this.b) != null) {
            v90Var.setNewMediaCounts(iu0Var.c);
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
            o6[] o6VarArr = this.x;
            if (!z13) {
                fArr[i10] = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.w;
                h5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                o6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                o6VarArr[i10].setVisibility(z10 ? 0 : 8);
                return;
            }
            o6VarArr[i10].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i10], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i10] = ofFloat;
            ofFloat.addUpdateListener(new gh.b(this, i10, 5));
            valueAnimatorArr[i10].addListener(new w90(this, i10, z10, 0));
            valueAnimatorArr[i10].setDuration(320L);
            valueAnimatorArr[i10].setInterpolator(jr.h);
            valueAnimatorArr[i10].start();
        }
    }

    public final void Z() {
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        lVar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), false);
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
        it0 it0Var;
        v90 v90Var = this.R;
        if (v90Var != null) {
            o6[] o6VarArr = this.x;
            if (o6VarArr[0] == null) {
                return;
            }
            int closestTab = v90Var.getClosestTab();
            int i10 = this.a;
            if (i10 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z11 = LocaleController.isRTL;
                boolean z12 = !z11;
                int i11 = (i10 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        Y(i11, true, true);
                        o6VarArr[i11].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z12, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                Y(i11, true, true);
                                if (this.R.getPhotosVideosTypeFilter() == 1) {
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z12, true);
                                    return;
                                } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z12, true);
                                    return;
                                } else {
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z12, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 2) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 3) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 4) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z12, true);
                                return;
                            } else if (closestTab == 5) {
                                Y(i11, true, true);
                                o6VarArr[i11].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z12, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    Y(i11, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    o6VarArr[i11].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z12, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.M;
                if (g1Var != null) {
                    g1Var.setEnabled(this.R.E());
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.M;
                    g1Var2.setAlpha(g1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.L;
                if (g1Var3 != null) {
                    v90 v90Var2 = this.R;
                    it0[] it0VarArr = v90Var2.g0;
                    if (it0VarArr != null && (it0Var = it0VarArr[0]) != null) {
                        boolean p02 = qu0.p0(it0Var.B);
                        int i12 = v90Var2.i1[p02 ? 1 : 0];
                        if (i12 != v90Var2.X(p02 ? 1 : 0, i12, true)) {
                            z10 = true;
                            g1Var3.setEnabled(z10);
                            org.telegram.ui.ActionBar.g1 g1Var4 = this.L;
                            g1Var4.setAlpha(!g1Var4.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    z10 = false;
                    g1Var3.setEnabled(z10);
                    org.telegram.ui.ActionBar.g1 g1Var42 = this.L;
                    g1Var42.setAlpha(!g1Var42.isEnabled() ? 1.0f : 0.5f);
                }
                int c02 = this.R.c0(8);
                if (c02 <= 0) {
                    Y(0, false, true);
                } else if (this.a != 3) {
                    Y(0, true, true);
                    o6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(o6VarArr[0].getText())) {
                    Y(0, true, true);
                    o6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z12, true);
                }
                if (this.a == 1) {
                    int c03 = this.R.c0(9);
                    if (c03 > 0) {
                        Y(1, true, true);
                        o6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z12, true);
                    } else {
                        Y(1, false, true);
                    }
                }
                if (this.C != null) {
                    v90 v90Var3 = this.R;
                    boolean z13 = v90Var3.c0(v90Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.C.setVisibility(0);
                    }
                    this.C.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new p90(0, this, z13)).setDuration(220L).setInterpolator(jr.h).start();
                }
                nh.d dVar = this.P;
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

    @Override // org.telegram.ui.ActionBar.o2
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
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        o6[] o6VarArr;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        e9 e9Var;
        org.telegram.ui.ActionBar.h5 h5Var;
        v90 v90Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        ?? r10;
        int i12;
        e9 e9Var2;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.A = h2Var;
        lVar.setBackButtonDrawable(h2Var);
        this.A.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new r90(this));
        FrameLayout frameLayout = new FrameLayout(context);
        s90 s90Var = new s90(this, context, frameLayout, 0);
        s90Var.J = true;
        this.fragmentView = s90Var;
        s90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        int i13 = this.a;
        if (i13 == 1 || i13 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, i7.f6.e(56, 56, 85));
            int i14 = org.telegram.ui.ActionBar.g6.z8;
            int themedColor = getThemedColor(i14);
            int i15 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, n10, themedColor, getThemedColor(i15));
            this.D = w0Var2;
            w0Var2.setIcon(R.drawable.msg_delete);
            this.D.setVisibility(8);
            this.D.setAlpha(0.0f);
            this.D.setOnClickListener(new u70(n10, 2));
            frameLayout2.addView(this.D);
            org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, n10, getThemedColor(i14), getThemedColor(i15));
            this.C = w0Var3;
            w0Var3.setIcon(R.drawable.ic_ab_other);
            final int i16 = 0;
            this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ y90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh.k6 k6Var;
                    lh.k6 k6Var2;
                    lh.k6 k6Var3;
                    lh.k6 k6Var4;
                    int i17;
                    int i18 = i16;
                    y90 y90Var = this.b;
                    switch (i18) {
                        case 0:
                            y90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = y90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                y90Var.M.setEnabled(true);
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(booleanValue);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = y90Var.R.x1(null, null);
                            if (x12 != null) {
                                y90Var.M.setEnabled(x12.booleanValue());
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(true);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = y90Var.H;
                            if (z10 && !y90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = y90Var.F;
                                int i19 = -y90Var.J;
                                y90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = y90Var.F;
                                boolean z11 = !z10;
                                y90Var.H = z11;
                                g1Var2.setChecked(z11);
                                v90 v90Var2 = y90Var.R;
                                boolean z12 = y90Var.H;
                                boolean z13 = y90Var.I;
                                xs0 xs0Var = v90Var2.V;
                                if (xs0Var != null && (k6Var2 = xs0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                er0 er0Var = v90Var2.a0;
                                if (er0Var != null && (k6Var = er0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = y90Var.I;
                            if (z14 && !y90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = y90Var.G;
                                int i20 = -y90Var.J;
                                y90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = y90Var.G;
                                boolean z15 = !z14;
                                y90Var.I = z15;
                                g1Var4.setChecked(z15);
                                v90 v90Var3 = y90Var.R;
                                boolean z16 = y90Var.H;
                                boolean z17 = y90Var.I;
                                xs0 xs0Var2 = v90Var3.V;
                                if (xs0Var2 != null && (k6Var4 = xs0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                er0 er0Var2 = v90Var3.a0;
                                if (er0Var2 != null && (k6Var3 = er0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            y90 y90Var2 = this.b;
                            jh.r5 r5Var = y90Var2.Q;
                            if (r5Var != null) {
                                r5Var.run();
                                y90Var2.Q = null;
                            }
                            mc.e();
                            boolean z18 = y90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (y90Var2.E != null) {
                                i17 = 0;
                                for (int i21 = 0; i21 < y90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i17++;
                                    }
                                }
                            } else {
                                i17 = 0;
                            }
                            y90Var2.R.L(false);
                            if (z18) {
                                y90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                y90Var2.getMessagesController().getStoriesController().n0(y90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y90Var2.Q = new jh.r5(y90Var2, arrayList, z18, 17);
                                org.telegram.ui.gg ggVar = new org.telegram.ui.gg(y90Var2, zArr2, arrayList, zArr, 20);
                                (z18 ? tc.a0(y90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i17, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ggVar).j() : tc.a0(y90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i17, new Object[0]), LocaleController.getString("Undo"), 5000, false, ggVar).j()).v = new gt(24, y90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.C.setVisibility(8);
            this.C.setAlpha(0.0f);
            frameLayout2.addView(this.C);
            org.telegram.ui.ActionBar.g1 e10 = this.C.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.L = e10;
            final int i17 = 1;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ y90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh.k6 k6Var;
                    lh.k6 k6Var2;
                    lh.k6 k6Var3;
                    lh.k6 k6Var4;
                    int i172;
                    int i18 = i17;
                    y90 y90Var = this.b;
                    switch (i18) {
                        case 0:
                            y90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = y90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                y90Var.M.setEnabled(true);
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(booleanValue);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = y90Var.R.x1(null, null);
                            if (x12 != null) {
                                y90Var.M.setEnabled(x12.booleanValue());
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(true);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = y90Var.H;
                            if (z10 && !y90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = y90Var.F;
                                int i19 = -y90Var.J;
                                y90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = y90Var.F;
                                boolean z11 = !z10;
                                y90Var.H = z11;
                                g1Var2.setChecked(z11);
                                v90 v90Var2 = y90Var.R;
                                boolean z12 = y90Var.H;
                                boolean z13 = y90Var.I;
                                xs0 xs0Var = v90Var2.V;
                                if (xs0Var != null && (k6Var2 = xs0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                er0 er0Var = v90Var2.a0;
                                if (er0Var != null && (k6Var = er0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = y90Var.I;
                            if (z14 && !y90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = y90Var.G;
                                int i20 = -y90Var.J;
                                y90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = y90Var.G;
                                boolean z15 = !z14;
                                y90Var.I = z15;
                                g1Var4.setChecked(z15);
                                v90 v90Var3 = y90Var.R;
                                boolean z16 = y90Var.H;
                                boolean z17 = y90Var.I;
                                xs0 xs0Var2 = v90Var3.V;
                                if (xs0Var2 != null && (k6Var4 = xs0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                er0 er0Var2 = v90Var3.a0;
                                if (er0Var2 != null && (k6Var3 = er0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            y90 y90Var2 = this.b;
                            jh.r5 r5Var = y90Var2.Q;
                            if (r5Var != null) {
                                r5Var.run();
                                y90Var2.Q = null;
                            }
                            mc.e();
                            boolean z18 = y90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (y90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < y90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            y90Var2.R.L(false);
                            if (z18) {
                                y90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                y90Var2.getMessagesController().getStoriesController().n0(y90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y90Var2.Q = new jh.r5(y90Var2, arrayList, z18, 17);
                                org.telegram.ui.gg ggVar = new org.telegram.ui.gg(y90Var2, zArr2, arrayList, zArr, 20);
                                (z18 ? tc.a0(y90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ggVar).j() : tc.a0(y90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ggVar).j()).v = new gt(24, y90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e11 = this.C.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.M = e11;
            final int i18 = 2;
            e11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ y90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh.k6 k6Var;
                    lh.k6 k6Var2;
                    lh.k6 k6Var3;
                    lh.k6 k6Var4;
                    int i172;
                    int i182 = i18;
                    y90 y90Var = this.b;
                    switch (i182) {
                        case 0:
                            y90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = y90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                y90Var.M.setEnabled(true);
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(booleanValue);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = y90Var.R.x1(null, null);
                            if (x12 != null) {
                                y90Var.M.setEnabled(x12.booleanValue());
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(true);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = y90Var.H;
                            if (z10 && !y90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = y90Var.F;
                                int i19 = -y90Var.J;
                                y90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = y90Var.F;
                                boolean z11 = !z10;
                                y90Var.H = z11;
                                g1Var2.setChecked(z11);
                                v90 v90Var2 = y90Var.R;
                                boolean z12 = y90Var.H;
                                boolean z13 = y90Var.I;
                                xs0 xs0Var = v90Var2.V;
                                if (xs0Var != null && (k6Var2 = xs0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                er0 er0Var = v90Var2.a0;
                                if (er0Var != null && (k6Var = er0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = y90Var.I;
                            if (z14 && !y90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = y90Var.G;
                                int i20 = -y90Var.J;
                                y90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = y90Var.G;
                                boolean z15 = !z14;
                                y90Var.I = z15;
                                g1Var4.setChecked(z15);
                                v90 v90Var3 = y90Var.R;
                                boolean z16 = y90Var.H;
                                boolean z17 = y90Var.I;
                                xs0 xs0Var2 = v90Var3.V;
                                if (xs0Var2 != null && (k6Var4 = xs0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                er0 er0Var2 = v90Var3.a0;
                                if (er0Var2 != null && (k6Var3 = er0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            y90 y90Var2 = this.b;
                            jh.r5 r5Var = y90Var2.Q;
                            if (r5Var != null) {
                                r5Var.run();
                                y90Var2.Q = null;
                            }
                            mc.e();
                            boolean z18 = y90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (y90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < y90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            y90Var2.R.L(false);
                            if (z18) {
                                y90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                y90Var2.getMessagesController().getStoriesController().n0(y90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y90Var2.Q = new jh.r5(y90Var2, arrayList, z18, 17);
                                org.telegram.ui.gg ggVar = new org.telegram.ui.gg(y90Var2, zArr2, arrayList, zArr, 20);
                                (z18 ? tc.a0(y90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ggVar).j() : tc.a0(y90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ggVar).j()).v = new gt(24, y90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e12 = this.C.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.K = e12;
            e12.setEnabled(false);
            this.K.setAlpha(0.5f);
            this.C.a(-1);
            org.telegram.ui.ActionBar.w0 w0Var4 = this.C;
            org.telegram.ui.ActionBar.g1 d = w0Var4.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, w0Var4.i0);
            this.F = d;
            d.setChecked(this.H);
            final int i19 = 3;
            this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ y90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh.k6 k6Var;
                    lh.k6 k6Var2;
                    lh.k6 k6Var3;
                    lh.k6 k6Var4;
                    int i172;
                    int i182 = i19;
                    y90 y90Var = this.b;
                    switch (i182) {
                        case 0:
                            y90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = y90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                y90Var.M.setEnabled(true);
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(booleanValue);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = y90Var.R.x1(null, null);
                            if (x12 != null) {
                                y90Var.M.setEnabled(x12.booleanValue());
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(true);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = y90Var.H;
                            if (z10 && !y90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = y90Var.F;
                                int i192 = -y90Var.J;
                                y90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = y90Var.F;
                                boolean z11 = !z10;
                                y90Var.H = z11;
                                g1Var2.setChecked(z11);
                                v90 v90Var2 = y90Var.R;
                                boolean z12 = y90Var.H;
                                boolean z13 = y90Var.I;
                                xs0 xs0Var = v90Var2.V;
                                if (xs0Var != null && (k6Var2 = xs0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                er0 er0Var = v90Var2.a0;
                                if (er0Var != null && (k6Var = er0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = y90Var.I;
                            if (z14 && !y90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = y90Var.G;
                                int i20 = -y90Var.J;
                                y90Var.J = i20;
                                AndroidUtilities.shakeViewSpring(g1Var3, i20);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = y90Var.G;
                                boolean z15 = !z14;
                                y90Var.I = z15;
                                g1Var4.setChecked(z15);
                                v90 v90Var3 = y90Var.R;
                                boolean z16 = y90Var.H;
                                boolean z17 = y90Var.I;
                                xs0 xs0Var2 = v90Var3.V;
                                if (xs0Var2 != null && (k6Var4 = xs0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                er0 er0Var2 = v90Var3.a0;
                                if (er0Var2 != null && (k6Var3 = er0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            y90 y90Var2 = this.b;
                            jh.r5 r5Var = y90Var2.Q;
                            if (r5Var != null) {
                                r5Var.run();
                                y90Var2.Q = null;
                            }
                            mc.e();
                            boolean z18 = y90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (y90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < y90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            y90Var2.R.L(false);
                            if (z18) {
                                y90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                y90Var2.getMessagesController().getStoriesController().n0(y90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y90Var2.Q = new jh.r5(y90Var2, arrayList, z18, 17);
                                org.telegram.ui.gg ggVar = new org.telegram.ui.gg(y90Var2, zArr2, arrayList, zArr, 20);
                                (z18 ? tc.a0(y90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ggVar).j() : tc.a0(y90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ggVar).j()).v = new gt(24, y90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.w0 w0Var5 = this.C;
            org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, w0Var5.i0);
            this.G = d10;
            d10.setChecked(this.I);
            final int i20 = 4;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ y90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh.k6 k6Var;
                    lh.k6 k6Var2;
                    lh.k6 k6Var3;
                    lh.k6 k6Var4;
                    int i172;
                    int i182 = i20;
                    y90 y90Var = this.b;
                    switch (i182) {
                        case 0:
                            y90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = y90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                y90Var.M.setEnabled(true);
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(booleanValue);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = y90Var.R.x1(null, null);
                            if (x12 != null) {
                                y90Var.M.setEnabled(x12.booleanValue());
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(true);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = y90Var.H;
                            if (z10 && !y90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = y90Var.F;
                                int i192 = -y90Var.J;
                                y90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = y90Var.F;
                                boolean z11 = !z10;
                                y90Var.H = z11;
                                g1Var2.setChecked(z11);
                                v90 v90Var2 = y90Var.R;
                                boolean z12 = y90Var.H;
                                boolean z13 = y90Var.I;
                                xs0 xs0Var = v90Var2.V;
                                if (xs0Var != null && (k6Var2 = xs0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                er0 er0Var = v90Var2.a0;
                                if (er0Var != null && (k6Var = er0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = y90Var.I;
                            if (z14 && !y90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = y90Var.G;
                                int i202 = -y90Var.J;
                                y90Var.J = i202;
                                AndroidUtilities.shakeViewSpring(g1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = y90Var.G;
                                boolean z15 = !z14;
                                y90Var.I = z15;
                                g1Var4.setChecked(z15);
                                v90 v90Var3 = y90Var.R;
                                boolean z16 = y90Var.H;
                                boolean z17 = y90Var.I;
                                xs0 xs0Var2 = v90Var3.V;
                                if (xs0Var2 != null && (k6Var4 = xs0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                er0 er0Var2 = v90Var3.a0;
                                if (er0Var2 != null && (k6Var3 = er0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            y90 y90Var2 = this.b;
                            jh.r5 r5Var = y90Var2.Q;
                            if (r5Var != null) {
                                r5Var.run();
                                y90Var2.Q = null;
                            }
                            mc.e();
                            boolean z18 = y90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (y90Var2.E != null) {
                                i172 = 0;
                                for (int i21 = 0; i21 < y90Var2.E.size(); i21++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var2.E.valueAt(i21)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            y90Var2.R.L(false);
                            if (z18) {
                                y90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i22);
                                    zArr[i22] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                y90Var2.getMessagesController().getStoriesController().n0(y90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y90Var2.Q = new jh.r5(y90Var2, arrayList, z18, 17);
                                org.telegram.ui.gg ggVar = new org.telegram.ui.gg(y90Var2, zArr2, arrayList, zArr, 20);
                                (z18 ? tc.a0(y90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ggVar).j() : tc.a0(y90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ggVar).j()).v = new gt(24, y90Var2, zArr2);
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
        frameLayout.addView(frameLayout3, i7.f6.e(-1, -1, 119));
        int i22 = 0;
        while (true) {
            int i23 = this.a == 1 ? 2 : 1;
            o6VarArr = this.x;
            h5VarArr = this.w;
            if (i22 >= i23) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i22] = frameLayout4;
            this.s.addView(frameLayout4, i7.f6.e(-1, -1, i21));
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
            frameLayoutArr[i22].addView(h5VarArr[i22], i7.f6.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            o6 o6Var = new o6(context, true, true, true);
            o6VarArr[i22] = o6Var;
            o6Var.b(0.4f, 320L, jr.h);
            o6VarArr[i22].setTextSize(AndroidUtilities.dp(14.0f));
            o6VarArr[i22].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
            frameLayoutArr[i22].addView(o6VarArr[i22], i7.f6.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i22 != 0) {
                frameLayoutArr[i22].setAlpha(0.0f);
            }
            i22++;
            i21 = 119;
        }
        t90 t90Var = new t90(context);
        this.y = t90Var;
        t90Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        e9 e9Var3 = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(e9Var3);
        frameLayout.addView(this.y, i7.f6.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        o6 o6Var2 = new o6(context, true, true, true);
        this.B = o6Var2;
        o6Var2.b(0.4f, 320L, jr.h);
        this.B.setTextSize(AndroidUtilities.dp(20.0f));
        this.B.setGravity(3);
        o6 o6Var3 = this.B;
        int i24 = org.telegram.ui.ActionBar.g6.G6;
        o6Var3.setTextColor(getThemedColor(i24));
        this.B.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.B, i7.f6.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            x90 x90Var = new x90(context, getResourceProvider());
            this.N = x90Var;
            x90Var.setOnTabClick(new y2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.O = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            nh.d dVar = new nh.d(context, getResourceProvider(), true);
            this.P = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.P.setShowZero(true);
            this.P.c(0, false);
            this.P.setEnabled(false);
            final int i25 = 5;
            this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q90
                public final /* synthetic */ y90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lh.k6 k6Var;
                    lh.k6 k6Var2;
                    lh.k6 k6Var3;
                    lh.k6 k6Var4;
                    int i172;
                    int i182 = i25;
                    y90 y90Var = this.b;
                    switch (i182) {
                        case 0:
                            y90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = y90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                y90Var.M.setEnabled(true);
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(booleanValue);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = y90Var.R.x1(null, null);
                            if (x12 != null) {
                                y90Var.M.setEnabled(x12.booleanValue());
                                y90Var.M.animate().alpha(y90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                y90Var.L.setEnabled(true);
                                y90Var.L.animate().alpha(y90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = y90Var.H;
                            if (z102 && !y90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = y90Var.F;
                                int i192 = -y90Var.J;
                                y90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(g1Var, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = y90Var.F;
                                boolean z11 = !z102;
                                y90Var.H = z11;
                                g1Var2.setChecked(z11);
                                v90 v90Var2 = y90Var.R;
                                boolean z12 = y90Var.H;
                                boolean z13 = y90Var.I;
                                xs0 xs0Var = v90Var2.V;
                                if (xs0Var != null && (k6Var2 = xs0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                er0 er0Var = v90Var2.a0;
                                if (er0Var != null && (k6Var = er0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = y90Var.I;
                            if (z14 && !y90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = y90Var.G;
                                int i202 = -y90Var.J;
                                y90Var.J = i202;
                                AndroidUtilities.shakeViewSpring(g1Var3, i202);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = y90Var.G;
                                boolean z15 = !z14;
                                y90Var.I = z15;
                                g1Var4.setChecked(z15);
                                v90 v90Var3 = y90Var.R;
                                boolean z16 = y90Var.H;
                                boolean z17 = y90Var.I;
                                xs0 xs0Var2 = v90Var3.V;
                                if (xs0Var2 != null && (k6Var4 = xs0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                er0 er0Var2 = v90Var3.a0;
                                if (er0Var2 != null && (k6Var3 = er0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            y90 y90Var2 = this.b;
                            jh.r5 r5Var = y90Var2.Q;
                            if (r5Var != null) {
                                r5Var.run();
                                y90Var2.Q = null;
                            }
                            mc.e();
                            boolean z18 = y90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (y90Var2.E != null) {
                                i172 = 0;
                                for (int i212 = 0; i212 < y90Var2.E.size(); i212++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var2.E.valueAt(i212)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i172++;
                                    }
                                }
                            } else {
                                i172 = 0;
                            }
                            y90Var2.R.L(false);
                            if (z18) {
                                y90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i222 = 0; i222 < arrayList.size(); i222++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i222);
                                    zArr[i222] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                y90Var2.getMessagesController().getStoriesController().n0(y90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y90Var2.Q = new jh.r5(y90Var2, arrayList, z18, 17);
                                org.telegram.ui.gg ggVar = new org.telegram.ui.gg(y90Var2, zArr2, arrayList, zArr, 20);
                                (z18 ? tc.a0(y90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i172, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), ggVar).j() : tc.a0(y90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i172, new Object[0]), LocaleController.getString("Undo"), 5000, false, ggVar).j()).v = new gt(24, y90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.O.addView(this.P);
            this.O.setAlpha(0.0f);
            this.O.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new eg.x(9));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.S = 11;
        }
        v90 v90Var2 = new v90(this, context, this.e, this.b, this.c, this.d, this.S, this, new u90(this), getResourceProvider(), frameLayout, s90Var);
        this.R = v90Var2;
        v90Var2.E0.setOpen(true);
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
            s90Var.addView(this.R, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            s90Var.addView(this.R);
        }
        s90Var.addView(this.actionBar);
        s90Var.addView(frameLayout);
        s90Var.P.add(this.R);
        if (this.a == 1) {
            Y(0, false, false);
            Y(1, false, false);
        }
        x90 x90Var2 = this.N;
        if (x90Var2 != null) {
            i10 = -1;
            s90Var.addView(x90Var2, i7.f6.e(-1, -2, 87));
        } else {
            i10 = -1;
        }
        FrameLayout frameLayout6 = this.O;
        if (frameLayout6 != null) {
            s90Var.addView(frameLayout6, i7.f6.e(i10, 64, 87));
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
                o6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i28));
            }
        } else if (i27 == 2) {
            h5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i27 != 1) {
                if (j10 == UserObject.ANONYMOUS) {
                    h5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    e9 e9Var4 = e9Var3;
                    e9Var4.g(21);
                    e9Var4.p = 0.75f;
                    e9Var2 = e9Var4;
                } else {
                    e9 e9Var5 = e9Var3;
                    if (this.f == 0 || j10 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(getMessagesController(), j10);
                            e9Var2 = e9Var5;
                            if (p10 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(p10.user_id));
                                e9Var2 = e9Var5;
                                if (user3 != null) {
                                    h5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    e9Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    e9Var = e9Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            e9Var2 = e9Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    h5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    e9Var5.g(1);
                                    e9Var5.p = 0.8f;
                                    e9Var2 = e9Var5;
                                } else {
                                    h5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    e9Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    e9Var = e9Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                            e9Var2 = e9Var5;
                            if (chat != 0) {
                                h5VarArr[0].k(chat.title);
                                e9Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                e9Var = e9Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", e9Var, user2);
                        h5Var = h5VarArr[0];
                        if (h5Var != null && TextUtils.isEmpty(h5Var.getText())) {
                            h5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        v90Var = this.R;
                        if (v90Var.s0(v90Var.g0[0].B) && this.a != 1) {
                            this.R.getSearchItem().setVisibility(0);
                        }
                        w0Var = this.R.i0;
                        if (w0Var != null) {
                            i11 = 11;
                            if (this.S != 11) {
                                w0Var.setVisibility(8);
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
                        it0[] it0VarArr = this.R.g0;
                        i12 = it0VarArr[r10].B;
                        if ((i12 != 0 || qu0.p0(i12) || it0VarArr[r10].B == i11) && this.a != 1) {
                            this.R.n0.setVisibility(r10);
                        } else {
                            this.R.n0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(s90Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        a0();
                        Z();
                        if (this.a == 1 && this.S == 9) {
                            this.R.M0(9.0f);
                        }
                        return s90Var;
                    }
                    h5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    e9Var5.g(22);
                    e9Var5.p = 0.75f;
                    e9Var2 = e9Var5;
                }
                user2 = null;
                e9Var = e9Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", e9Var, user2);
                h5Var = h5VarArr[0];
                if (h5Var != null) {
                    h5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                v90Var = this.R;
                if (v90Var.s0(v90Var.g0[0].B)) {
                    this.R.getSearchItem().setVisibility(0);
                }
                w0Var = this.R.i0;
                if (w0Var != null) {
                }
                if (this.R.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                it0[] it0VarArr2 = this.R.g0;
                i12 = it0VarArr2[r10].B;
                if (i12 != 0) {
                }
                this.R.n0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(s90Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                a0();
                Z();
                if (this.a == 1) {
                    this.R.M0(9.0f);
                }
                return s90Var;
            }
            h5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            h5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        e9Var2 = e9Var3;
        user2 = null;
        e9Var = e9Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", e9Var, user2);
        h5Var = h5VarArr[0];
        if (h5Var != null) {
        }
        v90Var = this.R;
        if (v90Var.s0(v90Var.g0[0].B)) {
        }
        w0Var = this.R.i0;
        if (w0Var != null) {
        }
        if (this.R.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        it0[] it0VarArr22 = this.R.g0;
        i12 = it0VarArr22[r10].B;
        if (i12 != 0) {
        }
        this.R.n0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(s90Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        a0();
        Z();
        if (this.a == 1) {
        }
        return s90Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            v90 v90Var = this.R;
            if (v90Var != null) {
                v90Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        x6 x6Var = new x6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.x0()) {
            return false;
        }
        v90 v90Var = this.R;
        return v90Var.getSelectedTab() == v90Var.E0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            v90 v90Var = this.R;
            if (!v90Var.y1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                v90Var.L(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            this.b = new iu0(this);
        }
        this.b.x.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        jh.r5 r5Var = this.Q;
        if (r5Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(r5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        v90 v90Var = this.R;
        if (v90Var != null) {
            v90Var.setPagesPaddingBottom(i13);
        }
    }
}
