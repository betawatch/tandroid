package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ua0 extends org.telegram.ui.ActionBar.r2 implements uv0, og.b, NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public org.telegram.ui.ActionBar.g1 G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.tg0 J;
    public final qh.b[] K;
    public int L;
    public FrameLayout M;
    public fi.d N;
    public oe.b O;
    public View P;
    public bi.u7 Q;
    public ta0 R;
    public int S;
    public String T;
    public int U;
    public int a;
    public tv0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public org.telegram.ui.ActionBar.y5 s;
    public SparseArray v;
    public org.telegram.ui.ActionBar.g1 w;
    public org.telegram.ui.ActionBar.g1 x;
    public boolean y;

    public ua0(Bundle bundle, tv0 tv0Var) {
        super(bundle);
        this.y = true;
        this.E = true;
        this.F = -12;
        this.K = new qh.b[2];
        this.L = -1;
        this.b = tv0Var;
    }

    @Override // og.b
    public final List B() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = rg.k1.m;
        return Arrays.asList(new og.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new cp(this, 29)));
    }

    @Override // org.telegram.ui.Components.uv0
    public final void N() {
        tv0 tv0Var;
        ta0 ta0Var = this.R;
        if (ta0Var != null && (tv0Var = this.b) != null) {
            ta0Var.setNewMediaCounts(tv0Var.c);
        }
        c0();
    }

    public final void X() {
        if (this.R == null) {
            return;
        }
        int i10 = 0;
        int dp = this.J != null ? AndroidUtilities.dp(72.0f) : 0;
        this.R.h1((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b) - AndroidUtilities.dp(6.0f), oi.a.c(this.mSystemInsets.b), oi.a.c(this.mSystemInsets.d + dp), this.mSystemInsets.d + dp);
        if (this.P != null) {
            int dp2 = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.P.getLayoutParams().height != dp2) {
                this.P.getLayoutParams().height = dp2;
                this.P.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i11 = this.mSystemInsets.d;
            layoutParams.height = i11 + dp;
            View view2 = this.navigationBarFadeView;
            if (i11 < AndroidUtilities.dp(40.0f) && dp <= 0) {
                i10 = 8;
            }
            view2.setVisibility(i10);
            this.navigationBarFadeView.requestLayout();
        }
        Y();
    }

    public final void Y() {
        if (this.J == null) {
            return;
        }
        float f7 = this.O.e;
        float dp = AndroidUtilities.dp(72.0f) + this.mSystemInsets.d;
        this.J.setTranslationY((dp * f7) + (-r2));
        float f10 = 1.0f - f7;
        this.J.setAlpha(f10);
        this.J.setVisibility(f7 < 1.0f ? 0 : 4);
        this.M.setTranslationY((dp * f10) + (-this.mSystemInsets.d));
        this.M.setAlpha(f7);
        this.M.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public final boolean Z() {
        int i10 = this.a;
        return i10 == 1 || i10 == 2;
    }

    public final void a0(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void b0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void c0() {
        int i10;
        ta0 ta0Var = this.R;
        if (ta0Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = ta0Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z10 = LocaleController.isRTL;
            if (closestTab == 8 || closestTab == 9) {
                org.telegram.ui.ActionBar.g1 g1Var = this.I;
                if (g1Var != null) {
                    g1Var.setEnabled(this.R.I());
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.I;
                    g1Var2.setAlpha(g1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.H;
                if (g1Var3 != null) {
                    g1Var3.setEnabled(this.R.H());
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.H;
                    g1Var4.setAlpha(g1Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int j02 = this.R.j0(closestTab);
                if (this.a != 3) {
                    if (closestTab == 8) {
                        b0(j02 > 0 ? LocaleController.formatPluralString("ProfileMyStoriesCount", j02, new Object[0]) : null);
                    } else {
                        b0(j02 > 0 ? LocaleController.formatPluralString("ProfileStoriesArchiveCount", j02, new Object[0]) : null);
                    }
                } else if (j02 > 0) {
                    b0(LocaleController.formatPluralStringSpaced("FoundStories", j02));
                }
                d0(true);
                org.telegram.ui.ActionBar.y5 y5Var = this.s;
                if (y5Var != null) {
                    y5Var.Y(j02 > 0, true);
                }
                fi.d dVar = this.N;
                if (dVar != null) {
                    boolean z11 = !z10 && this.U == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.v;
                        dVar.i(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z11, true);
                    } else {
                        dVar.i(LocaleController.getString(R.string.SaveToProfile), z11, true);
                    }
                    this.U = closestTab;
                }
                org.telegram.ui.ActionBar.g1 g1Var5 = this.G;
                if (g1Var5 != null) {
                    boolean z12 = j02 > 0;
                    g1Var5.setEnabled(z12);
                    this.G.setAlpha(z12 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                b0(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.R.getPhotosVideosTypeFilter() == 1) {
                            b0(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                            return;
                        } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                            b0(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                            return;
                        } else {
                            b0(LocaleController.formatPluralString("Media", iArr[0], new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        b0(LocaleController.formatPluralString("Files", iArr[1], new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        b0(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        b0(LocaleController.formatPluralString("Links", iArr[3], new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        b0(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        b0(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i10 = iArr[8]) >= 0) {
                        b0(LocaleController.formatPluralString("ProfilePollsCount", i10, new Object[0]));
                    } else if (closestTab == 10) {
                        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                        b0(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        if (this.R.F0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        oi.a aVar;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 13));
        bh.r rVar = new bh.r(this, context, 19);
        this.fragmentView = rVar;
        if (this.a == 0 && this.e == getUserConfig().getClientUserId() && this.f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.S = 11;
        }
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        ta0 ta0Var = new ta0(this, context, this.e, this.b, this.c, this.d, this.S, this, new sa0(this), getResourceProvider(), baseSimpleGlass.c);
        this.R = ta0Var;
        ta0Var.K0.setOpen(true);
        this.R.setPinnedToTop(true);
        rVar.addView(this.R, kb1.g(-1.0f, -1));
        if (Z()) {
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.ic_ab_other);
            this.s = a2;
            a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.s.Y(false, false);
            org.telegram.ui.ActionBar.g1 e = this.s.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.H = e;
            final int i11 = 0;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ra0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    int i12;
                    int i13 = i11;
                    ua0 ua0Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean K1 = ua0Var.R.K1(null, null);
                            if (K1 != null) {
                                ua0Var.e0(true, K1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean L1 = ua0Var.R.L1(null, null);
                            if (L1 != null) {
                                ua0Var.e0(L1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = ua0Var.y;
                            if (z10 && !ua0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ua0Var.w;
                                int i14 = -ua0Var.F;
                                ua0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = ua0Var.w;
                                boolean z11 = !z10;
                                ua0Var.y = z11;
                                g1Var2.setChecked(z11);
                                ta0 ta0Var2 = ua0Var.R;
                                boolean z12 = ua0Var.y;
                                boolean z13 = ua0Var.E;
                                iu0 iu0Var = ta0Var2.e0;
                                if (iu0Var != null && (z6Var2 = iu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                us0 us0Var = ta0Var2.g0;
                                if (us0Var != null && (z6Var = us0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = ua0Var.E;
                            if (z14 && !ua0Var.y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ua0Var.x;
                                int i15 = -ua0Var.F;
                                ua0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = ua0Var.x;
                                boolean z15 = !z14;
                                ua0Var.E = z15;
                                g1Var4.setChecked(z15);
                                ta0 ta0Var3 = ua0Var.R;
                                boolean z16 = ua0Var.y;
                                boolean z17 = ua0Var.E;
                                iu0 iu0Var2 = ta0Var3.e0;
                                if (iu0Var2 != null && (z6Var4 = iu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                us0 us0Var2 = ta0Var3.g0;
                                if (us0Var2 != null && (z6Var3 = us0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ua0 ua0Var2 = this.b;
                            bi.u7 u7Var = ua0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ua0Var2.Q = null;
                            }
                            qc.e();
                            boolean z18 = ua0Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ua0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ua0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ua0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            ua0Var2.R.S(false);
                            if (z18) {
                                ua0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ua0Var2.getMessagesController().getStoriesController().q0(ua0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ua0Var2.Q = new bi.u7(ua0Var2, arrayList, z18, 21);
                                e10 e10Var = new e10(ua0Var2, zArr2, arrayList, zArr, 4);
                                (z18 ? wc.b0(ua0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i12, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j() : wc.b0(ua0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i12, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j()).w = new u90(2, ua0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e10 = this.s.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.I = e10;
            final int i12 = 1;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ra0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    int i122;
                    int i13 = i12;
                    ua0 ua0Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean K1 = ua0Var.R.K1(null, null);
                            if (K1 != null) {
                                ua0Var.e0(true, K1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean L1 = ua0Var.R.L1(null, null);
                            if (L1 != null) {
                                ua0Var.e0(L1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = ua0Var.y;
                            if (z10 && !ua0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ua0Var.w;
                                int i14 = -ua0Var.F;
                                ua0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = ua0Var.w;
                                boolean z11 = !z10;
                                ua0Var.y = z11;
                                g1Var2.setChecked(z11);
                                ta0 ta0Var2 = ua0Var.R;
                                boolean z12 = ua0Var.y;
                                boolean z13 = ua0Var.E;
                                iu0 iu0Var = ta0Var2.e0;
                                if (iu0Var != null && (z6Var2 = iu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                us0 us0Var = ta0Var2.g0;
                                if (us0Var != null && (z6Var = us0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = ua0Var.E;
                            if (z14 && !ua0Var.y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ua0Var.x;
                                int i15 = -ua0Var.F;
                                ua0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = ua0Var.x;
                                boolean z15 = !z14;
                                ua0Var.E = z15;
                                g1Var4.setChecked(z15);
                                ta0 ta0Var3 = ua0Var.R;
                                boolean z16 = ua0Var.y;
                                boolean z17 = ua0Var.E;
                                iu0 iu0Var2 = ta0Var3.e0;
                                if (iu0Var2 != null && (z6Var4 = iu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                us0 us0Var2 = ta0Var3.g0;
                                if (us0Var2 != null && (z6Var3 = us0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ua0 ua0Var2 = this.b;
                            bi.u7 u7Var = ua0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ua0Var2.Q = null;
                            }
                            qc.e();
                            boolean z18 = ua0Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ua0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ua0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ua0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            ua0Var2.R.S(false);
                            if (z18) {
                                ua0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ua0Var2.getMessagesController().getStoriesController().q0(ua0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ua0Var2.Q = new bi.u7(ua0Var2, arrayList, z18, 21);
                                e10 e10Var = new e10(ua0Var2, zArr2, arrayList, zArr, 4);
                                (z18 ? wc.b0(ua0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i122, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j() : wc.b0(ua0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i122, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j()).w = new u90(2, ua0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e11 = this.s.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.G = e11;
            e11.setEnabled(false);
            this.G.setAlpha(0.5f);
            this.s.a(-1);
            org.telegram.ui.ActionBar.y5 y5Var = this.s;
            org.telegram.ui.ActionBar.g1 d = y5Var.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, y5Var.m0);
            this.w = d;
            d.setChecked(this.y);
            final int i13 = 2;
            this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ra0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    int i122;
                    int i132 = i13;
                    ua0 ua0Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean K1 = ua0Var.R.K1(null, null);
                            if (K1 != null) {
                                ua0Var.e0(true, K1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean L1 = ua0Var.R.L1(null, null);
                            if (L1 != null) {
                                ua0Var.e0(L1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = ua0Var.y;
                            if (z10 && !ua0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ua0Var.w;
                                int i14 = -ua0Var.F;
                                ua0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = ua0Var.w;
                                boolean z11 = !z10;
                                ua0Var.y = z11;
                                g1Var2.setChecked(z11);
                                ta0 ta0Var2 = ua0Var.R;
                                boolean z12 = ua0Var.y;
                                boolean z13 = ua0Var.E;
                                iu0 iu0Var = ta0Var2.e0;
                                if (iu0Var != null && (z6Var2 = iu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                us0 us0Var = ta0Var2.g0;
                                if (us0Var != null && (z6Var = us0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = ua0Var.E;
                            if (z14 && !ua0Var.y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ua0Var.x;
                                int i15 = -ua0Var.F;
                                ua0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = ua0Var.x;
                                boolean z15 = !z14;
                                ua0Var.E = z15;
                                g1Var4.setChecked(z15);
                                ta0 ta0Var3 = ua0Var.R;
                                boolean z16 = ua0Var.y;
                                boolean z17 = ua0Var.E;
                                iu0 iu0Var2 = ta0Var3.e0;
                                if (iu0Var2 != null && (z6Var4 = iu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                us0 us0Var2 = ta0Var3.g0;
                                if (us0Var2 != null && (z6Var3 = us0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ua0 ua0Var2 = this.b;
                            bi.u7 u7Var = ua0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ua0Var2.Q = null;
                            }
                            qc.e();
                            boolean z18 = ua0Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ua0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ua0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ua0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            ua0Var2.R.S(false);
                            if (z18) {
                                ua0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ua0Var2.getMessagesController().getStoriesController().q0(ua0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ua0Var2.Q = new bi.u7(ua0Var2, arrayList, z18, 21);
                                e10 e10Var = new e10(ua0Var2, zArr2, arrayList, zArr, 4);
                                (z18 ? wc.b0(ua0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i122, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j() : wc.b0(ua0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i122, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j()).w = new u90(2, ua0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.y5 y5Var2 = this.s;
            org.telegram.ui.ActionBar.g1 d10 = y5Var2.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, y5Var2.m0);
            this.x = d10;
            d10.setChecked(this.E);
            final int i14 = 3;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ra0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    int i122;
                    int i132 = i14;
                    ua0 ua0Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean K1 = ua0Var.R.K1(null, null);
                            if (K1 != null) {
                                ua0Var.e0(true, K1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean L1 = ua0Var.R.L1(null, null);
                            if (L1 != null) {
                                ua0Var.e0(L1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = ua0Var.y;
                            if (z10 && !ua0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ua0Var.w;
                                int i142 = -ua0Var.F;
                                ua0Var.F = i142;
                                AndroidUtilities.shakeViewSpring(g1Var, i142);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = ua0Var.w;
                                boolean z11 = !z10;
                                ua0Var.y = z11;
                                g1Var2.setChecked(z11);
                                ta0 ta0Var2 = ua0Var.R;
                                boolean z12 = ua0Var.y;
                                boolean z13 = ua0Var.E;
                                iu0 iu0Var = ta0Var2.e0;
                                if (iu0Var != null && (z6Var2 = iu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                us0 us0Var = ta0Var2.g0;
                                if (us0Var != null && (z6Var = us0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = ua0Var.E;
                            if (z14 && !ua0Var.y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ua0Var.x;
                                int i15 = -ua0Var.F;
                                ua0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = ua0Var.x;
                                boolean z15 = !z14;
                                ua0Var.E = z15;
                                g1Var4.setChecked(z15);
                                ta0 ta0Var3 = ua0Var.R;
                                boolean z16 = ua0Var.y;
                                boolean z17 = ua0Var.E;
                                iu0 iu0Var2 = ta0Var3.e0;
                                if (iu0Var2 != null && (z6Var4 = iu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                us0 us0Var2 = ta0Var3.g0;
                                if (us0Var2 != null && (z6Var3 = us0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ua0 ua0Var2 = this.b;
                            bi.u7 u7Var = ua0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ua0Var2.Q = null;
                            }
                            qc.e();
                            boolean z18 = ua0Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ua0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ua0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ua0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            ua0Var2.R.S(false);
                            if (z18) {
                                ua0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ua0Var2.getMessagesController().getStoriesController().q0(ua0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ua0Var2.Q = new bi.u7(ua0Var2, arrayList, z18, 21);
                                e10 e10Var = new e10(ua0Var2, zArr2, arrayList, zArr, 4);
                                (z18 ? wc.b0(ua0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i122, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j() : wc.b0(ua0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i122, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j()).w = new u90(2, ua0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i15 = this.a;
        qh.b[] bVarArr = this.K;
        if (i15 == 1) {
            org.telegram.ui.tg0 tg0Var = new org.telegram.ui.tg0(context, getResourceProvider());
            this.J = tg0Var;
            tg0Var.setClipChildren(false);
            this.J.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.Q, R.string.ProfileMyStoriesTab);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.R, R.string.ProfileStoriesArchiveTab);
            for (int i16 = 0; i16 < bVarArr.length; i16++) {
                bVarArr[i16].setOnClickListener(new ai.w(this, i16, 15));
                this.J.addView(bVarArr[i16]);
                this.J.i(bVarArr[i16], true, false);
            }
            aVar = baseSimpleGlass;
            eh.d c10 = aVar.c.c(this.J, gh.c.f(getResourceProvider()), false);
            org.telegram.messenger.wh.s(c10, AndroidUtilities.dp(28.0f), 7.666f);
            this.J.setBackground(c10);
            rVar.addView(this.J, kb1.i(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.M = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            fi.d dVar = new fi.d(context, getResourceProvider(), true);
            this.N = dVar;
            dVar.i(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.N.setShowZero(true);
            this.N.b(0, false);
            this.N.setEnabled(false);
            final int i17 = 4;
            this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ra0
                public final /* synthetic */ ua0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    int i122;
                    int i132 = i17;
                    ua0 ua0Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean K1 = ua0Var.R.K1(null, null);
                            if (K1 != null) {
                                ua0Var.e0(true, K1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean L1 = ua0Var.R.L1(null, null);
                            if (L1 != null) {
                                ua0Var.e0(L1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = ua0Var.y;
                            if (z10 && !ua0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ua0Var.w;
                                int i142 = -ua0Var.F;
                                ua0Var.F = i142;
                                AndroidUtilities.shakeViewSpring(g1Var, i142);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var2 = ua0Var.w;
                                boolean z11 = !z10;
                                ua0Var.y = z11;
                                g1Var2.setChecked(z11);
                                ta0 ta0Var2 = ua0Var.R;
                                boolean z12 = ua0Var.y;
                                boolean z13 = ua0Var.E;
                                iu0 iu0Var = ta0Var2.e0;
                                if (iu0Var != null && (z6Var2 = iu0Var.s) != null) {
                                    z6Var2.n = z12;
                                    z6Var2.o = z13;
                                    z6Var2.d(true);
                                }
                                us0 us0Var = ta0Var2.g0;
                                if (us0Var != null && (z6Var = us0Var.s) != null) {
                                    z6Var.n = z12;
                                    z6Var.o = z13;
                                    z6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = ua0Var.E;
                            if (z14 && !ua0Var.y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ua0Var.x;
                                int i152 = -ua0Var.F;
                                ua0Var.F = i152;
                                AndroidUtilities.shakeViewSpring(g1Var3, i152);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.g1 g1Var4 = ua0Var.x;
                                boolean z15 = !z14;
                                ua0Var.E = z15;
                                g1Var4.setChecked(z15);
                                ta0 ta0Var3 = ua0Var.R;
                                boolean z16 = ua0Var.y;
                                boolean z17 = ua0Var.E;
                                iu0 iu0Var2 = ta0Var3.e0;
                                if (iu0Var2 != null && (z6Var4 = iu0Var2.s) != null) {
                                    z6Var4.n = z16;
                                    z6Var4.o = z17;
                                    z6Var4.d(true);
                                }
                                us0 us0Var2 = ta0Var3.g0;
                                if (us0Var2 != null && (z6Var3 = us0Var2.s) != null) {
                                    z6Var3.n = z16;
                                    z6Var3.o = z17;
                                    z6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            ua0 ua0Var2 = this.b;
                            bi.u7 u7Var = ua0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ua0Var2.Q = null;
                            }
                            qc.e();
                            boolean z18 = ua0Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (ua0Var2.v != null) {
                                int i162 = 0;
                                for (int i172 = 0; i172 < ua0Var2.v.size(); i172++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ua0Var2.v.valueAt(i172)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i162++;
                                    }
                                }
                                i122 = i162;
                            } else {
                                i122 = 0;
                            }
                            ua0Var2.R.S(false);
                            if (z18) {
                                ua0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                ua0Var2.getMessagesController().getStoriesController().q0(ua0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ua0Var2.Q = new bi.u7(ua0Var2, arrayList, z18, 21);
                                e10 e10Var = new e10(ua0Var2, zArr2, arrayList, zArr, 4);
                                (z18 ? wc.b0(ua0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i122, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j() : wc.b0(ua0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i122, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j()).w = new u90(2, ua0Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.M.addView(this.N, kb1.g(56.0f, -1));
            this.M.setVisibility(4);
            rVar.addView(this.M, kb1.i(-1, 72, 80));
            int i18 = 9;
            this.O = new oe.b(0, new tv(this, i18), ds.h, 320L, false);
            setBulletinDelegate(new bh.c0(this, i18));
        } else {
            aVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.P = view;
        this.R.y(view);
        View view2 = this.P;
        view2.setBackground(aVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(aVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.tg0 tg0Var2 = this.J;
        rVar.addView(view4, tg0Var2 != null ? rVar.indexOfChild(tg0Var2) : rVar.getChildCount(), kb1.i(-1, 0, 80));
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        aVar.g = rVar;
        aVar.h = null;
        aVar.f(rVar, r5Var, resourceProvider);
        aVar.i = new bi.g(7, this, rVar);
        this.R.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        d0(false);
        if (this.a == 3 && (i10 = this.r) != -1) {
            this.simpleActionBar.setSubtitle(LocaleController.formatPluralStringSpaced("FoundStories", i10));
        }
        X();
        c0();
        if (this.a == 1) {
            int i19 = this.S != 9 ? 0 : 1;
            org.telegram.ui.tg0 tg0Var3 = this.J;
            if (tg0Var3 != null && this.L != i19) {
                this.L = i19;
                tg0Var3.q(bVarArr[i19], false);
            }
        }
        return rVar;
    }

    public final void d0(boolean z10) {
        String str;
        int i10 = this.a;
        boolean z11 = true;
        if (i10 == 3) {
            str = this.h;
        } else if (i10 == 2) {
            str = LocaleController.getString(R.string.ProfileStoriesArchive);
        } else if (i10 == 1) {
            ta0 ta0Var = this.R;
            if (ta0Var != null && ta0Var.getClosestTab() != 9) {
                z11 = false;
            }
            str = LocaleController.getString(z11 ? R.string.ProfileStoriesArchive : R.string.ProfileMyStories);
        } else {
            long j10 = (this.f == 0 || this.e != getUserConfig().getClientUserId()) ? this.e : this.f;
            if (j10 == UserObject.ANONYMOUS) {
                str = LocaleController.getString(R.string.AnonymousForward);
            } else if (this.f != 0 && j10 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.MyNotes);
            } else if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(getMessagesController(), j10);
                TLRPC.User user = m10 != null ? getMessagesController().getUser(Long.valueOf(m10.user_id)) : null;
                if (user != null) {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
                str = null;
            } else if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                if (user2 != null) {
                    str = user2.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user2.first_name, user2.last_name);
                }
                str = null;
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    str = chat.title;
                }
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.SharedContentTitle);
            }
        }
        String str2 = str;
        boolean z12 = z11;
        if (TextUtils.equals(this.T, str2)) {
            return;
        }
        this.T = str2;
        if (!z10) {
            this.simpleActionBar.setTitle(str2);
            return;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        r5Var.getClass();
        r5Var.w(str2, z12, 320L, ds.h);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ta0 ta0Var = this.R;
            if (ta0Var != null) {
                ta0Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        this.I.setEnabled(z10);
        this.I.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.H.setEnabled(z11);
        this.H.animate().alpha(z11 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? navigationBarColor : getLastStoryViewer().getNavigationBarColor(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.F0()) {
            return false;
        }
        ta0 ta0Var = this.R;
        return ta0Var.getSelectedTab() == ta0Var.K0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            ta0 ta0Var = this.R;
            if (!ta0Var.E1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                ta0Var.S(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i10 = this.a;
        this.S = getArguments().getInt("start_from", i10 == 2 ? 9 : i10 == 1 ? 8 : 0);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.e) && this.f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.b == null) {
            this.b = new tv0(this);
        }
        this.b.x.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        bi.u7 u7Var = this.Q;
        if (u7Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(u7Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        X();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
