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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k90 extends org.telegram.ui.ActionBar.o2 implements xt0, uf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.h2 A;
    public j6 B;
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
    public j90 N;
    public FrameLayout O;
    public kh.d P;
    public gh.u5 Q;
    public h90 R;
    public int S;
    public int T;
    public final boolean[] U;
    public final float[] V;
    public final boolean[] W;
    public final ValueAnimator[] X;
    public int a;
    public wt0 b;
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
    public f90 y;

    public k90(Bundle bundle, wt0 wt0Var) {
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
        this.b = wt0Var;
    }

    @Override // uf.b
    public final List A() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = xf.k1.m;
        return Arrays.asList(new uf.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new np(this, 26)));
    }

    @Override // org.telegram.ui.Components.xt0
    public final void L() {
        wt0 wt0Var;
        h90 h90Var = this.R;
        if (h90Var != null && (wt0Var = this.b) != null) {
            h90Var.setNewMediaCounts(wt0Var.c);
        }
        Z();
    }

    public final void W(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void X(int i9, boolean z10, boolean z11) {
        int i10 = this.a;
        if (i10 == 3) {
            return;
        }
        if (i9 == 1 && i10 == 2) {
            return;
        }
        boolean[] zArr = this.U;
        boolean z12 = zArr[i9];
        boolean[] zArr2 = this.W;
        if (z12 != z10 || zArr2[i9]) {
            boolean z13 = !zArr2[i9] && z11;
            zArr2[i9] = false;
            zArr[i9] = z10;
            ValueAnimator[] valueAnimatorArr = this.X;
            ValueAnimator valueAnimator = valueAnimatorArr[i9];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimatorArr[i9] = null;
            }
            float[] fArr = this.V;
            j6[] j6VarArr = this.x;
            if (!z13) {
                fArr[i9] = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.w;
                h5VarArr[i9].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i9].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i9].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                j6VarArr[i9].setAlpha(z10 ? 1.0f : 0.0f);
                j6VarArr[i9].setVisibility(z10 ? 0 : 8);
                return;
            }
            j6VarArr[i9].setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr[i9], z10 ? 1.0f : 0.0f);
            valueAnimatorArr[i9] = ofFloat;
            ofFloat.addUpdateListener(new dh.b(this, i9, 5));
            valueAnimatorArr[i9].addListener(new i90(this, i9, z10, 0));
            valueAnimatorArr[i9].setDuration(320L);
            valueAnimatorArr[i9].setInterpolator(gr.h);
            valueAnimatorArr[i9].start();
        }
    }

    public final void Y() {
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.w;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        boolean z10;
        xs0 xs0Var;
        h90 h90Var = this.R;
        if (h90Var != null) {
            j6[] j6VarArr = this.x;
            if (j6VarArr[0] == null) {
                return;
            }
            int closestTab = h90Var.getClosestTab();
            int i9 = this.a;
            if (i9 != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z11 = LocaleController.isRTL;
                boolean z12 = !z11;
                int i10 = (i9 == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        X(i10, true, true);
                        j6VarArr[i10].c(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z12, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                X(i10, true, true);
                                if (this.R.getPhotosVideosTypeFilter() == 1) {
                                    j6VarArr[i10].c(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z12, true);
                                    return;
                                } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                                    j6VarArr[i10].c(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z12, true);
                                    return;
                                } else {
                                    j6VarArr[i10].c(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z12, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                X(i10, true, true);
                                j6VarArr[i10].c(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 2) {
                                X(i10, true, true);
                                j6VarArr[i10].c(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 3) {
                                X(i10, true, true);
                                j6VarArr[i10].c(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z12, true);
                                return;
                            }
                            if (closestTab == 4) {
                                X(i10, true, true);
                                j6VarArr[i10].c(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z12, true);
                                return;
                            } else if (closestTab == 5) {
                                X(i10, true, true);
                                j6VarArr[i10].c(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z12, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    X(i10, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                    j6VarArr[i10].c(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z12, true);
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
                    h90 h90Var2 = this.R;
                    xs0[] xs0VarArr = h90Var2.g0;
                    if (xs0VarArr != null && (xs0Var = xs0VarArr[0]) != null) {
                        boolean p02 = eu0.p0(xs0Var.B);
                        int i11 = h90Var2.i1[p02 ? 1 : 0];
                        if (i11 != h90Var2.X(p02 ? 1 : 0, i11, true)) {
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
                    X(0, false, true);
                } else if (this.a != 3) {
                    X(0, true, true);
                    j6VarArr[0].c(LocaleController.formatPluralString("ProfileMyStoriesCount", c02, new Object[0]), z12, true);
                } else if (TextUtils.isEmpty(j6VarArr[0].getText())) {
                    X(0, true, true);
                    j6VarArr[0].c(LocaleController.formatPluralStringSpaced("FoundStories", c02), z12, true);
                }
                if (this.a == 1) {
                    int c03 = this.R.c0(9);
                    if (c03 > 0) {
                        X(1, true, true);
                        j6VarArr[1].c(LocaleController.formatPluralString("ProfileStoriesArchiveCount", c03, new Object[0]), z12, true);
                    } else {
                        X(1, false, true);
                    }
                }
                if (this.C != null) {
                    h90 h90Var3 = this.R;
                    boolean z13 = h90Var3.c0(h90Var3.getClosestTab()) <= 0;
                    if (!z13) {
                        this.C.setVisibility(0);
                    }
                    this.C.animate().alpha(z13 ? 0.0f : 1.0f).withEndAction(new a50(1, this, z13)).setDuration(220L).setInterpolator(gr.h).start();
                }
                kh.d dVar = this.P;
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
        j6[] j6VarArr;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        int i9;
        TLRPC.User user;
        TLRPC.User user2;
        z8 z8Var;
        org.telegram.ui.ActionBar.h5 h5Var;
        h90 h90Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        ?? r10;
        int i11;
        z8 z8Var2;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.A = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.A.k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new d90(this));
        FrameLayout frameLayout = new FrameLayout(context);
        e90 e90Var = new e90(this, context, frameLayout, 0);
        e90Var.J = true;
        this.fragmentView = e90Var;
        e90Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i12 = this.a;
        if (i12 == 1 || i12 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, g7.e6.e(56, 56, 85));
            int i13 = org.telegram.ui.ActionBar.f6.z8;
            int themedColor = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.f6.G6;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, n10, themedColor, getThemedColor(i14));
            this.D = w0Var2;
            w0Var2.setIcon(R.drawable.msg_delete);
            this.D.setVisibility(8);
            this.D.setAlpha(0.0f);
            this.D.setOnClickListener(new h70(n10, 2));
            frameLayout2.addView(this.D);
            org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, n10, getThemedColor(i13), getThemedColor(i14));
            this.C = w0Var3;
            w0Var3.setIcon(R.drawable.ic_ab_other);
            final int i15 = 0;
            this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ih.n6 n6Var;
                    ih.n6 n6Var2;
                    ih.n6 n6Var3;
                    ih.n6 n6Var4;
                    int i16;
                    int i17 = i15;
                    k90 k90Var = this.b;
                    switch (i17) {
                        case 0:
                            k90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = k90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                k90Var.M.setEnabled(true);
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(booleanValue);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = k90Var.R.x1(null, null);
                            if (x12 != null) {
                                k90Var.M.setEnabled(x12.booleanValue());
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(true);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = k90Var.H;
                            if (z10 && !k90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = k90Var.F;
                                int i18 = -k90Var.J;
                                k90Var.J = i18;
                                AndroidUtilities.shakeViewSpring(g1Var, i18);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = k90Var.F;
                                boolean z11 = !z10;
                                k90Var.H = z11;
                                g1Var2.setChecked(z11);
                                h90 h90Var2 = k90Var.R;
                                boolean z12 = k90Var.H;
                                boolean z13 = k90Var.I;
                                ms0 ms0Var = h90Var2.V;
                                if (ms0Var != null && (n6Var2 = ms0Var.s) != null) {
                                    n6Var2.n = z12;
                                    n6Var2.o = z13;
                                    n6Var2.d(true);
                                }
                                tq0 tq0Var = h90Var2.a0;
                                if (tq0Var != null && (n6Var = tq0Var.s) != null) {
                                    n6Var.n = z12;
                                    n6Var.o = z13;
                                    n6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = k90Var.I;
                            if (z14 && !k90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = k90Var.G;
                                int i19 = -k90Var.J;
                                k90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var3, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = k90Var.G;
                                boolean z15 = !z14;
                                k90Var.I = z15;
                                g1Var4.setChecked(z15);
                                h90 h90Var3 = k90Var.R;
                                boolean z16 = k90Var.H;
                                boolean z17 = k90Var.I;
                                ms0 ms0Var2 = h90Var3.V;
                                if (ms0Var2 != null && (n6Var4 = ms0Var2.s) != null) {
                                    n6Var4.n = z16;
                                    n6Var4.o = z17;
                                    n6Var4.d(true);
                                }
                                tq0 tq0Var2 = h90Var3.a0;
                                if (tq0Var2 != null && (n6Var3 = tq0Var2.s) != null) {
                                    n6Var3.n = z16;
                                    n6Var3.o = z17;
                                    n6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            gh.u5 u5Var = k90Var2.Q;
                            if (u5Var != null) {
                                u5Var.run();
                                k90Var2.Q = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.E != null) {
                                i16 = 0;
                                for (int i20 = 0; i20 < k90Var2.E.size(); i20++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var2.E.valueAt(i20)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                            } else {
                                i16 = 0;
                            }
                            k90Var2.R.L(false);
                            if (z18) {
                                k90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i21);
                                    zArr[i21] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().getStoriesController().n0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.Q = new gh.u5(k90Var2, arrayList, z18, 17);
                                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) k90Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z18 ? oc.a0(k90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i16, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), k6Var).j() : oc.a0(k90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i16, new Object[0]), LocaleController.getString("Undo"), 5000, false, k6Var).j()).v = new zq(27, k90Var2, zArr2);
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
            final int i16 = 1;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ih.n6 n6Var;
                    ih.n6 n6Var2;
                    ih.n6 n6Var3;
                    ih.n6 n6Var4;
                    int i162;
                    int i17 = i16;
                    k90 k90Var = this.b;
                    switch (i17) {
                        case 0:
                            k90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = k90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                k90Var.M.setEnabled(true);
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(booleanValue);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = k90Var.R.x1(null, null);
                            if (x12 != null) {
                                k90Var.M.setEnabled(x12.booleanValue());
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(true);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = k90Var.H;
                            if (z10 && !k90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = k90Var.F;
                                int i18 = -k90Var.J;
                                k90Var.J = i18;
                                AndroidUtilities.shakeViewSpring(g1Var, i18);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = k90Var.F;
                                boolean z11 = !z10;
                                k90Var.H = z11;
                                g1Var2.setChecked(z11);
                                h90 h90Var2 = k90Var.R;
                                boolean z12 = k90Var.H;
                                boolean z13 = k90Var.I;
                                ms0 ms0Var = h90Var2.V;
                                if (ms0Var != null && (n6Var2 = ms0Var.s) != null) {
                                    n6Var2.n = z12;
                                    n6Var2.o = z13;
                                    n6Var2.d(true);
                                }
                                tq0 tq0Var = h90Var2.a0;
                                if (tq0Var != null && (n6Var = tq0Var.s) != null) {
                                    n6Var.n = z12;
                                    n6Var.o = z13;
                                    n6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = k90Var.I;
                            if (z14 && !k90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = k90Var.G;
                                int i19 = -k90Var.J;
                                k90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var3, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = k90Var.G;
                                boolean z15 = !z14;
                                k90Var.I = z15;
                                g1Var4.setChecked(z15);
                                h90 h90Var3 = k90Var.R;
                                boolean z16 = k90Var.H;
                                boolean z17 = k90Var.I;
                                ms0 ms0Var2 = h90Var3.V;
                                if (ms0Var2 != null && (n6Var4 = ms0Var2.s) != null) {
                                    n6Var4.n = z16;
                                    n6Var4.o = z17;
                                    n6Var4.d(true);
                                }
                                tq0 tq0Var2 = h90Var3.a0;
                                if (tq0Var2 != null && (n6Var3 = tq0Var2.s) != null) {
                                    n6Var3.n = z16;
                                    n6Var3.o = z17;
                                    n6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            gh.u5 u5Var = k90Var2.Q;
                            if (u5Var != null) {
                                u5Var.run();
                                k90Var2.Q = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.E != null) {
                                i162 = 0;
                                for (int i20 = 0; i20 < k90Var2.E.size(); i20++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var2.E.valueAt(i20)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i162++;
                                    }
                                }
                            } else {
                                i162 = 0;
                            }
                            k90Var2.R.L(false);
                            if (z18) {
                                k90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i21);
                                    zArr[i21] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().getStoriesController().n0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.Q = new gh.u5(k90Var2, arrayList, z18, 17);
                                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) k90Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z18 ? oc.a0(k90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i162, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), k6Var).j() : oc.a0(k90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i162, new Object[0]), LocaleController.getString("Undo"), 5000, false, k6Var).j()).v = new zq(27, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e11 = this.C.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.M = e11;
            final int i17 = 2;
            e11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ih.n6 n6Var;
                    ih.n6 n6Var2;
                    ih.n6 n6Var3;
                    ih.n6 n6Var4;
                    int i162;
                    int i172 = i17;
                    k90 k90Var = this.b;
                    switch (i172) {
                        case 0:
                            k90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = k90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                k90Var.M.setEnabled(true);
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(booleanValue);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = k90Var.R.x1(null, null);
                            if (x12 != null) {
                                k90Var.M.setEnabled(x12.booleanValue());
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(true);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = k90Var.H;
                            if (z10 && !k90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = k90Var.F;
                                int i18 = -k90Var.J;
                                k90Var.J = i18;
                                AndroidUtilities.shakeViewSpring(g1Var, i18);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = k90Var.F;
                                boolean z11 = !z10;
                                k90Var.H = z11;
                                g1Var2.setChecked(z11);
                                h90 h90Var2 = k90Var.R;
                                boolean z12 = k90Var.H;
                                boolean z13 = k90Var.I;
                                ms0 ms0Var = h90Var2.V;
                                if (ms0Var != null && (n6Var2 = ms0Var.s) != null) {
                                    n6Var2.n = z12;
                                    n6Var2.o = z13;
                                    n6Var2.d(true);
                                }
                                tq0 tq0Var = h90Var2.a0;
                                if (tq0Var != null && (n6Var = tq0Var.s) != null) {
                                    n6Var.n = z12;
                                    n6Var.o = z13;
                                    n6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = k90Var.I;
                            if (z14 && !k90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = k90Var.G;
                                int i19 = -k90Var.J;
                                k90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var3, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = k90Var.G;
                                boolean z15 = !z14;
                                k90Var.I = z15;
                                g1Var4.setChecked(z15);
                                h90 h90Var3 = k90Var.R;
                                boolean z16 = k90Var.H;
                                boolean z17 = k90Var.I;
                                ms0 ms0Var2 = h90Var3.V;
                                if (ms0Var2 != null && (n6Var4 = ms0Var2.s) != null) {
                                    n6Var4.n = z16;
                                    n6Var4.o = z17;
                                    n6Var4.d(true);
                                }
                                tq0 tq0Var2 = h90Var3.a0;
                                if (tq0Var2 != null && (n6Var3 = tq0Var2.s) != null) {
                                    n6Var3.n = z16;
                                    n6Var3.o = z17;
                                    n6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            gh.u5 u5Var = k90Var2.Q;
                            if (u5Var != null) {
                                u5Var.run();
                                k90Var2.Q = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.E != null) {
                                i162 = 0;
                                for (int i20 = 0; i20 < k90Var2.E.size(); i20++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var2.E.valueAt(i20)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i162++;
                                    }
                                }
                            } else {
                                i162 = 0;
                            }
                            k90Var2.R.L(false);
                            if (z18) {
                                k90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i21);
                                    zArr[i21] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().getStoriesController().n0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.Q = new gh.u5(k90Var2, arrayList, z18, 17);
                                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) k90Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z18 ? oc.a0(k90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i162, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), k6Var).j() : oc.a0(k90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i162, new Object[0]), LocaleController.getString("Undo"), 5000, false, k6Var).j()).v = new zq(27, k90Var2, zArr2);
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
            final int i18 = 3;
            this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ih.n6 n6Var;
                    ih.n6 n6Var2;
                    ih.n6 n6Var3;
                    ih.n6 n6Var4;
                    int i162;
                    int i172 = i18;
                    k90 k90Var = this.b;
                    switch (i172) {
                        case 0:
                            k90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = k90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                k90Var.M.setEnabled(true);
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(booleanValue);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = k90Var.R.x1(null, null);
                            if (x12 != null) {
                                k90Var.M.setEnabled(x12.booleanValue());
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(true);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = k90Var.H;
                            if (z10 && !k90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = k90Var.F;
                                int i182 = -k90Var.J;
                                k90Var.J = i182;
                                AndroidUtilities.shakeViewSpring(g1Var, i182);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = k90Var.F;
                                boolean z11 = !z10;
                                k90Var.H = z11;
                                g1Var2.setChecked(z11);
                                h90 h90Var2 = k90Var.R;
                                boolean z12 = k90Var.H;
                                boolean z13 = k90Var.I;
                                ms0 ms0Var = h90Var2.V;
                                if (ms0Var != null && (n6Var2 = ms0Var.s) != null) {
                                    n6Var2.n = z12;
                                    n6Var2.o = z13;
                                    n6Var2.d(true);
                                }
                                tq0 tq0Var = h90Var2.a0;
                                if (tq0Var != null && (n6Var = tq0Var.s) != null) {
                                    n6Var.n = z12;
                                    n6Var.o = z13;
                                    n6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = k90Var.I;
                            if (z14 && !k90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = k90Var.G;
                                int i19 = -k90Var.J;
                                k90Var.J = i19;
                                AndroidUtilities.shakeViewSpring(g1Var3, i19);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = k90Var.G;
                                boolean z15 = !z14;
                                k90Var.I = z15;
                                g1Var4.setChecked(z15);
                                h90 h90Var3 = k90Var.R;
                                boolean z16 = k90Var.H;
                                boolean z17 = k90Var.I;
                                ms0 ms0Var2 = h90Var3.V;
                                if (ms0Var2 != null && (n6Var4 = ms0Var2.s) != null) {
                                    n6Var4.n = z16;
                                    n6Var4.o = z17;
                                    n6Var4.d(true);
                                }
                                tq0 tq0Var2 = h90Var3.a0;
                                if (tq0Var2 != null && (n6Var3 = tq0Var2.s) != null) {
                                    n6Var3.n = z16;
                                    n6Var3.o = z17;
                                    n6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            gh.u5 u5Var = k90Var2.Q;
                            if (u5Var != null) {
                                u5Var.run();
                                k90Var2.Q = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.E != null) {
                                i162 = 0;
                                for (int i20 = 0; i20 < k90Var2.E.size(); i20++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var2.E.valueAt(i20)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i162++;
                                    }
                                }
                            } else {
                                i162 = 0;
                            }
                            k90Var2.R.L(false);
                            if (z18) {
                                k90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i21);
                                    zArr[i21] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().getStoriesController().n0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.Q = new gh.u5(k90Var2, arrayList, z18, 17);
                                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) k90Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z18 ? oc.a0(k90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i162, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), k6Var).j() : oc.a0(k90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i162, new Object[0]), LocaleController.getString("Undo"), 5000, false, k6Var).j()).v = new zq(27, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.w0 w0Var5 = this.C;
            org.telegram.ui.ActionBar.g1 d9 = w0Var5.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, w0Var5.i0);
            this.G = d9;
            d9.setChecked(this.I);
            final int i19 = 4;
            this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ih.n6 n6Var;
                    ih.n6 n6Var2;
                    ih.n6 n6Var3;
                    ih.n6 n6Var4;
                    int i162;
                    int i172 = i19;
                    k90 k90Var = this.b;
                    switch (i172) {
                        case 0:
                            k90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = k90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                k90Var.M.setEnabled(true);
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(booleanValue);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = k90Var.R.x1(null, null);
                            if (x12 != null) {
                                k90Var.M.setEnabled(x12.booleanValue());
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(true);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z10 = k90Var.H;
                            if (z10 && !k90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = k90Var.F;
                                int i182 = -k90Var.J;
                                k90Var.J = i182;
                                AndroidUtilities.shakeViewSpring(g1Var, i182);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = k90Var.F;
                                boolean z11 = !z10;
                                k90Var.H = z11;
                                g1Var2.setChecked(z11);
                                h90 h90Var2 = k90Var.R;
                                boolean z12 = k90Var.H;
                                boolean z13 = k90Var.I;
                                ms0 ms0Var = h90Var2.V;
                                if (ms0Var != null && (n6Var2 = ms0Var.s) != null) {
                                    n6Var2.n = z12;
                                    n6Var2.o = z13;
                                    n6Var2.d(true);
                                }
                                tq0 tq0Var = h90Var2.a0;
                                if (tq0Var != null && (n6Var = tq0Var.s) != null) {
                                    n6Var.n = z12;
                                    n6Var.o = z13;
                                    n6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = k90Var.I;
                            if (z14 && !k90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = k90Var.G;
                                int i192 = -k90Var.J;
                                k90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(g1Var3, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = k90Var.G;
                                boolean z15 = !z14;
                                k90Var.I = z15;
                                g1Var4.setChecked(z15);
                                h90 h90Var3 = k90Var.R;
                                boolean z16 = k90Var.H;
                                boolean z17 = k90Var.I;
                                ms0 ms0Var2 = h90Var3.V;
                                if (ms0Var2 != null && (n6Var4 = ms0Var2.s) != null) {
                                    n6Var4.n = z16;
                                    n6Var4.o = z17;
                                    n6Var4.d(true);
                                }
                                tq0 tq0Var2 = h90Var3.a0;
                                if (tq0Var2 != null && (n6Var3 = tq0Var2.s) != null) {
                                    n6Var3.n = z16;
                                    n6Var3.o = z17;
                                    n6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            gh.u5 u5Var = k90Var2.Q;
                            if (u5Var != null) {
                                u5Var.run();
                                k90Var2.Q = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.E != null) {
                                i162 = 0;
                                for (int i20 = 0; i20 < k90Var2.E.size(); i20++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var2.E.valueAt(i20)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i162++;
                                    }
                                }
                            } else {
                                i162 = 0;
                            }
                            k90Var2.R.L(false);
                            if (z18) {
                                k90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i21);
                                    zArr[i21] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().getStoriesController().n0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.Q = new gh.u5(k90Var2, arrayList, z18, 17);
                                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) k90Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z18 ? oc.a0(k90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i162, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), k6Var).j() : oc.a0(k90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i162, new Object[0]), LocaleController.getString("Undo"), 5000, false, k6Var).j()).v = new zq(27, k90Var2, zArr2);
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
        int i20 = 119;
        frameLayout.addView(frameLayout3, g7.e6.e(-1, -1, 119));
        int i21 = 0;
        while (true) {
            int i22 = this.a == 1 ? 2 : 1;
            j6VarArr = this.x;
            h5VarArr = this.w;
            if (i21 >= i22) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout[] frameLayoutArr = this.v;
            frameLayoutArr[i21] = frameLayout4;
            this.s.addView(frameLayout4, g7.e6.e(-1, -1, i20));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
            h5VarArr[i21] = h5Var2;
            h5Var2.setPivotX(0.0f);
            h5VarArr[i21].setPivotY(AndroidUtilities.dp(9.0f));
            h5VarArr[i21].setTextSize(18);
            h5VarArr[i21].setGravity(3);
            h5VarArr[i21].setTypeface(AndroidUtilities.bold());
            h5VarArr[i21].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5VarArr[i21].setScrollNonFitText(true);
            h5VarArr[i21].setImportantForAccessibility(2);
            frameLayoutArr[i21].addView(h5VarArr[i21], g7.e6.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            j6 j6Var = new j6(context, true, true, true);
            j6VarArr[i21] = j6Var;
            j6Var.b(0.4f, 320L, gr.h);
            j6VarArr[i21].setTextSize(AndroidUtilities.dp(14.0f));
            j6VarArr[i21].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pi, false));
            frameLayoutArr[i21].addView(j6VarArr[i21], g7.e6.d(-2, -2.0f, 51, z10 ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i21 != 0) {
                frameLayoutArr[i21].setAlpha(0.0f);
            }
            i21++;
            i20 = 119;
        }
        f90 f90Var = new f90(context);
        this.y = f90Var;
        f90Var.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.y.setRoundRadius(AndroidUtilities.dp((this.e == getUserConfig().getClientUserId() && this.f == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.y.setPivotX(0.0f);
        this.y.setPivotY(0.0f);
        z8 z8Var3 = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var3.l = true;
        this.y.setVisibility(z10 ? 0 : 8);
        this.y.setImageDrawable(z8Var3);
        frameLayout.addView(this.y, g7.e6.d(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.B = j6Var2;
        j6Var2.b(0.4f, 320L, gr.h);
        this.B.setTextSize(AndroidUtilities.dp(20.0f));
        this.B.setGravity(3);
        j6 j6Var3 = this.B;
        int i23 = org.telegram.ui.ActionBar.f6.G6;
        j6Var3.setTextColor(getThemedColor(i23));
        this.B.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.B, g7.e6.d(-2, -1.0f, 23, (z10 ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.a == 1) {
            j90 j90Var = new j90(context, getResourceProvider());
            this.N = j90Var;
            j90Var.setOnTabClick(new v2(this, 6));
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.O = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            kh.d dVar = new kh.d(context, getResourceProvider(), true);
            this.P = dVar;
            dVar.g(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.P.setShowZero(true);
            this.P.c(0, false);
            this.P.setEnabled(false);
            final int i24 = 5;
            this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ih.n6 n6Var;
                    ih.n6 n6Var2;
                    ih.n6 n6Var3;
                    ih.n6 n6Var4;
                    int i162;
                    int i172 = i24;
                    k90 k90Var = this.b;
                    switch (i172) {
                        case 0:
                            k90Var.C.M(null, null);
                            break;
                        case 1:
                            Boolean w12 = k90Var.R.w1(null, null);
                            if (w12 != null) {
                                boolean booleanValue = w12.booleanValue();
                                k90Var.M.setEnabled(true);
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(booleanValue);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean x12 = k90Var.R.x1(null, null);
                            if (x12 != null) {
                                k90Var.M.setEnabled(x12.booleanValue());
                                k90Var.M.animate().alpha(k90Var.M.isEnabled() ? 1.0f : 0.5f).start();
                                k90Var.L.setEnabled(true);
                                k90Var.L.animate().alpha(k90Var.L.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z102 = k90Var.H;
                            if (z102 && !k90Var.I) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = k90Var.F;
                                int i182 = -k90Var.J;
                                k90Var.J = i182;
                                AndroidUtilities.shakeViewSpring(g1Var, i182);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = k90Var.F;
                                boolean z11 = !z102;
                                k90Var.H = z11;
                                g1Var2.setChecked(z11);
                                h90 h90Var2 = k90Var.R;
                                boolean z12 = k90Var.H;
                                boolean z13 = k90Var.I;
                                ms0 ms0Var = h90Var2.V;
                                if (ms0Var != null && (n6Var2 = ms0Var.s) != null) {
                                    n6Var2.n = z12;
                                    n6Var2.o = z13;
                                    n6Var2.d(true);
                                }
                                tq0 tq0Var = h90Var2.a0;
                                if (tq0Var != null && (n6Var = tq0Var.s) != null) {
                                    n6Var.n = z12;
                                    n6Var.o = z13;
                                    n6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z14 = k90Var.I;
                            if (z14 && !k90Var.H) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = k90Var.G;
                                int i192 = -k90Var.J;
                                k90Var.J = i192;
                                AndroidUtilities.shakeViewSpring(g1Var3, i192);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = k90Var.G;
                                boolean z15 = !z14;
                                k90Var.I = z15;
                                g1Var4.setChecked(z15);
                                h90 h90Var3 = k90Var.R;
                                boolean z16 = k90Var.H;
                                boolean z17 = k90Var.I;
                                ms0 ms0Var2 = h90Var3.V;
                                if (ms0Var2 != null && (n6Var4 = ms0Var2.s) != null) {
                                    n6Var4.n = z16;
                                    n6Var4.o = z17;
                                    n6Var4.d(true);
                                }
                                tq0 tq0Var2 = h90Var3.a0;
                                if (tq0Var2 != null && (n6Var3 = tq0Var2.s) != null) {
                                    n6Var3.n = z16;
                                    n6Var3.o = z17;
                                    n6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            gh.u5 u5Var = k90Var2.Q;
                            if (u5Var != null) {
                                u5Var.run();
                                k90Var2.Q = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.E != null) {
                                i162 = 0;
                                for (int i202 = 0; i202 < k90Var2.E.size(); i202++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var2.E.valueAt(i202)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i162++;
                                    }
                                }
                            } else {
                                i162 = 0;
                            }
                            k90Var2.R.L(false);
                            if (z18) {
                                k90Var2.R.Y0(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i212 = 0; i212 < arrayList.size(); i212++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i212);
                                    zArr[i212] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().getStoriesController().n0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.Q = new gh.u5(k90Var2, arrayList, z18, 17);
                                org.telegram.ui.k6 k6Var = new org.telegram.ui.k6((Object) k90Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z18 ? oc.a0(k90Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i162, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), k6Var).j() : oc.a0(k90Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i162, new Object[0]), LocaleController.getString("Undo"), 5000, false, k6Var).j()).v = new zq(27, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.O.addView(this.P);
            this.O.setAlpha(0.0f);
            this.O.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new bg.z(11));
        }
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.S = 11;
        }
        h90 h90Var2 = new h90(this, context, this.e, this.b, this.c, this.d, this.S, this, new g90(this), getResourceProvider(), frameLayout, e90Var);
        this.R = h90Var2;
        h90Var2.E0.setOpen(true);
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i23), PorterDuff.Mode.SRC_IN));
        }
        this.R.setPinnedToTop(true);
        this.R.getSearchItem().setTranslationY(0.0f);
        this.R.n0.setTranslationY(0.0f);
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i25 = this.a;
        if (i25 == 1 || i25 == 2) {
            e90Var.addView(this.R, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            e90Var.addView(this.R);
        }
        e90Var.addView(this.actionBar);
        e90Var.addView(frameLayout);
        e90Var.P.add(this.R);
        if (this.a == 1) {
            X(0, false, false);
            X(1, false, false);
        }
        j90 j90Var2 = this.N;
        if (j90Var2 != null) {
            i9 = -1;
            e90Var.addView(j90Var2, g7.e6.e(-1, -2, 87));
        } else {
            i9 = -1;
        }
        FrameLayout frameLayout6 = this.O;
        if (frameLayout6 != null) {
            e90Var.addView(frameLayout6, g7.e6.e(i9, 64, 87));
        }
        long j10 = this.e;
        if (this.f != 0 && j10 == getUserConfig().getClientUserId()) {
            j10 = this.f;
        }
        int i26 = this.a;
        if (i26 == 3) {
            h5VarArr[0].k(this.h);
            int i27 = this.r;
            if (i27 != i9) {
                j6VarArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i27));
            }
        } else if (i26 == 2) {
            h5VarArr[0].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i26 != 1) {
                if (j10 == UserObject.ANONYMOUS) {
                    h5VarArr[0].k(LocaleController.getString(R.string.AnonymousForward));
                    z8 z8Var4 = z8Var3;
                    z8Var4.g(21);
                    z8Var4.p = 0.75f;
                    z8Var2 = z8Var4;
                } else {
                    z8 z8Var5 = z8Var3;
                    if (this.f == 0 || j10 != getUserConfig().getClientUserId()) {
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(getMessagesController(), j10);
                            z8Var2 = z8Var5;
                            if (l10 != null) {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(l10.user_id));
                                z8Var2 = z8Var5;
                                if (user3 != null) {
                                    h5VarArr[0].k(ContactsController.formatName(user3.first_name, user3.last_name));
                                    z8Var5.m(this.currentAccount, user3);
                                    user = user3;
                                    user2 = user;
                                    z8Var = z8Var5;
                                }
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
                            z8Var2 = z8Var5;
                            if (user4 != null) {
                                if (user4.self) {
                                    h5VarArr[0].k(LocaleController.getString(R.string.SavedMessages));
                                    z8Var5.g(1);
                                    z8Var5.p = 0.8f;
                                    z8Var2 = z8Var5;
                                } else {
                                    h5VarArr[0].k(ContactsController.formatName(user4.first_name, user4.last_name));
                                    z8Var5.m(this.currentAccount, user4);
                                    user = user4;
                                    user2 = user;
                                    z8Var = z8Var5;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                            z8Var2 = z8Var5;
                            if (chat != 0) {
                                h5VarArr[0].k(chat.title);
                                z8Var5.k(this.currentAccount, chat);
                                user = chat;
                                user2 = user;
                                z8Var = z8Var5;
                            }
                        }
                        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", z8Var, user2);
                        h5Var = h5VarArr[0];
                        if (h5Var != null && TextUtils.isEmpty(h5Var.getText())) {
                            h5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                        }
                        h90Var = this.R;
                        if (h90Var.s0(h90Var.g0[0].B) && this.a != 1) {
                            this.R.getSearchItem().setVisibility(0);
                        }
                        w0Var = this.R.i0;
                        if (w0Var != null) {
                            i10 = 11;
                            if (this.S != 11) {
                                w0Var.setVisibility(8);
                            }
                        } else {
                            i10 = 11;
                        }
                        if (this.R.getSearchOptionsItem() != null || this.a == 1) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                            this.R.A(!r0.s0(r0.g0[0].B), false);
                            this.R.getSearchOptionsItem().setVisibility(0);
                        }
                        xs0[] xs0VarArr = this.R.g0;
                        i11 = xs0VarArr[r10].B;
                        if ((i11 != 0 || eu0.p0(i11) || xs0VarArr[r10].B == i10) && this.a != 1) {
                            this.R.n0.setVisibility(r10);
                        } else {
                            this.R.n0.setVisibility(4);
                        }
                        this.actionBar.setDrawBlurBackground(e90Var);
                        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                        Z();
                        Y();
                        if (this.a == 1 && this.S == 9) {
                            this.R.M0(9.0f);
                        }
                        return e90Var;
                    }
                    h5VarArr[0].k(LocaleController.getString(R.string.MyNotes));
                    z8Var5.g(22);
                    z8Var5.p = 0.75f;
                    z8Var2 = z8Var5;
                }
                user2 = null;
                z8Var = z8Var2;
                this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", z8Var, user2);
                h5Var = h5VarArr[0];
                if (h5Var != null) {
                    h5VarArr[0].k(LocaleController.getString(R.string.SharedContentTitle));
                }
                h90Var = this.R;
                if (h90Var.s0(h90Var.g0[0].B)) {
                    this.R.getSearchItem().setVisibility(0);
                }
                w0Var = this.R.i0;
                if (w0Var != null) {
                }
                if (this.R.getSearchOptionsItem() != null) {
                }
                r10 = 0;
                xs0[] xs0VarArr2 = this.R.g0;
                i11 = xs0VarArr2[r10].B;
                if (i11 != 0) {
                }
                this.R.n0.setVisibility(r10);
                this.actionBar.setDrawBlurBackground(e90Var);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
                Z();
                Y();
                if (this.a == 1) {
                    this.R.M0(9.0f);
                }
                return e90Var;
            }
            h5VarArr[0].k(LocaleController.getString(R.string.ProfileMyStories));
            h5VarArr[1].k(LocaleController.getString(R.string.ProfileStoriesArchive));
        }
        z8Var2 = z8Var3;
        user2 = null;
        z8Var = z8Var2;
        this.y.h(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", z8Var, user2);
        h5Var = h5VarArr[0];
        if (h5Var != null) {
        }
        h90Var = this.R;
        if (h90Var.s0(h90Var.g0[0].B)) {
        }
        w0Var = this.R.i0;
        if (w0Var != null) {
        }
        if (this.R.getSearchOptionsItem() != null) {
        }
        r10 = 0;
        xs0[] xs0VarArr22 = this.R.g0;
        i11 = xs0VarArr22[r10].B;
        if (i11 != 0) {
        }
        this.R.n0.setVisibility(r10);
        this.actionBar.setDrawBlurBackground(e90Var);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r10);
        Z();
        Y();
        if (this.a == 1) {
        }
        return e90Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            h90 h90Var = this.R;
            if (h90Var != null) {
                h90Var.setUserInfo(userFull);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.d6);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        s6 s6Var = new s6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.G6));
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false);
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
        h90 h90Var = this.R;
        return h90Var.getSelectedTab() == h90Var.E0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            h90 h90Var = this.R;
            if (!h90Var.y1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                h90Var.L(false);
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
        int i9 = this.a;
        this.S = getArguments().getInt("start_from", i9 == 2 ? 9 : i9 == 1 ? 8 : 0);
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
            this.b = new wt0(this);
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
        gh.u5 u5Var = this.Q;
        if (u5Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(u5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        h90 h90Var = this.R;
        if (h90Var != null) {
            h90Var.setPagesPaddingBottom(i12);
        }
    }
}
