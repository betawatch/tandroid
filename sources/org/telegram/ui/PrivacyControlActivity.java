package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t40 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public final boolean[] F;
    public boolean F0;
    public ArrayList G;
    public boolean G0;
    public ArrayList H;
    public boolean H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public long K;
    public boolean K0;
    public long L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public int O0;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public zx0 a;
    public int a0;
    public org.telegram.ui.Components.or b;
    public int b0;
    public org.telegram.ui.ActionBar.v0 c;
    public int c0;
    private int currentPhotoForRestRow;
    public org.telegram.ui.Components.ll0 d;
    public int d0;
    public ay0 e;
    public int e0;
    private int everybodyRow;
    public int f;
    public int f0;
    public int g0;
    private int giftTypesHeaderRow;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final ArrayList n;
    public int n0;
    private int nobodyRow;
    public int o0;
    public int p0;
    private int photoForRestRow;
    private int priceRow;
    public int q0;
    public final ArrayList r;
    public int r0;
    private int readRow;
    public final boolean[] s;
    public final org.telegram.ui.Components.u40 s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public org.telegram.ui.Components.xi0 t0;
    public org.telegram.ui.Cells.r8 u0;
    public final boolean[] v;
    public org.telegram.ui.Components.x9 v0;
    public final boolean[] w;
    public qs w0;
    public final int x;
    public TLRPC.PhotoSize x0;
    public final boolean[] y;
    public TLRPC.Photo y0;
    public SpannableString z0;

    public PrivacyControlActivity(int i10, boolean z10) {
        super(null);
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = new boolean[4];
        this.v = new boolean[4];
        this.w = new boolean[4];
        this.y = new boolean[4];
        this.E = new boolean[4];
        this.F = new boolean[4];
        this.L = 10L;
        this.O0 = 4;
        this.x = i10;
        if (z10) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i10 == 4) {
            org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
            this.s0 = u40Var;
            u40Var.a = this;
            u40Var.b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) {
                return;
            }
            this.x0 = closestPhotoSizeWithSize;
            this.y0 = userFull.fallback_photo;
        }
    }

    public static /* synthetic */ void U(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.x0 = null;
        privacyControlActivity.y0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull == null || (photo = userFull.fallback_photo) == null) {
            return;
        }
        userFull.flags &= -4194305;
        userFull.fallback_photo = null;
        privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
        privacyControlActivity.D0();
        privacyControlActivity.F0(true);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        byte[] bArr = photo.file_reference;
        tL_inputPhoto.file_reference = bArr;
        if (bArr == null) {
            tL_inputPhoto.file_reference = new byte[0];
        }
        MessagesController.getInstance(privacyControlActivity.currentAccount).deleteUserPhoto(tL_inputPhoto);
        NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    public static /* synthetic */ void V(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            privacyControlActivity.B0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, 13);
        AndroidUtilities.runOnUIThread(new rx0(1, privacyControlActivity, zArr));
    }

    public static /* synthetic */ void W(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
            userFull.flags |= TLObject.FLAG_22;
            userFull.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && privacyControlActivity.x0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.x0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.x0.location.volume_id);
                sb2.append("_");
                String n10 = a4.a.n(privacyControlActivity.x0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || privacyControlActivity.x0 == null) {
                return;
            }
            FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.x0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    public static void X(PrivacyControlActivity privacyControlActivity, View view, int i10) {
        boolean z10;
        int i11;
        int i12 = privacyControlActivity.x;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new mx0(privacyControlActivity, 1), null).a;
            b2Var.show();
            b2Var.h();
            return;
        }
        int i13 = 0;
        r2 = false;
        boolean z11 = false;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.u40 u40Var = privacyControlActivity.s0;
            if (u40Var != null) {
                u40Var.o(false, new ah.j(19), new r5(privacyControlActivity, 13), 0);
                privacyControlActivity.t0.K(0);
                privacyControlActivity.t0.N(43);
                privacyControlActivity.u0.e.d();
                return;
            }
            return;
        }
        if (i12 == 10 && i10 == privacyControlActivity.O && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new mx0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i14 = -privacyControlActivity.O0;
            privacyControlActivity.O0 = i14;
            AndroidUtilities.shakeViewSpring(view, i14);
            return;
        }
        if (i12 == 8 && ((i10 == privacyControlActivity.O || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.yc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new mx0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i15 = -privacyControlActivity.O0;
            privacyControlActivity.O0 = i15;
            AndroidUtilities.shakeViewSpring(view, i15);
            return;
        }
        if (i10 == privacyControlActivity.nobodyRow || i10 == privacyControlActivity.everybodyRow || i10 == privacyControlActivity.O || i10 == privacyControlActivity.g0) {
            if (i12 == 12 && privacyControlActivity.u0()) {
                int i16 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i16;
                AndroidUtilities.shakeViewSpring(view, i16);
                return;
            }
            if (i10 == privacyControlActivity.nobodyRow) {
                i13 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                i13 = i10 == privacyControlActivity.g0 ? 3 : 2;
            }
            if (i13 == privacyControlActivity.I) {
                return;
            }
            privacyControlActivity.I = i13;
            org.telegram.ui.Components.qc.e();
            privacyControlActivity.E0();
            privacyControlActivity.F0(true);
            return;
        }
        if (i10 == privacyControlActivity.X || i10 == privacyControlActivity.W) {
            int i17 = i10 != privacyControlActivity.W ? 1 : 0;
            if (i17 == privacyControlActivity.J) {
                return;
            }
            privacyControlActivity.J = i17;
            privacyControlActivity.E0();
            privacyControlActivity.F0(true);
            return;
        }
        if (i10 == privacyControlActivity.T || i10 == privacyControlActivity.S) {
            if (i12 == 12 && privacyControlActivity.u0()) {
                int i18 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i18;
                AndroidUtilities.shakeViewSpring(view, i18);
                return;
            }
            ArrayList arrayList = i10 == privacyControlActivity.T ? privacyControlActivity.H : privacyControlActivity.G;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i10 == privacyControlActivity.T ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i12 != 0 ? 1 : 0);
            if (i10 == privacyControlActivity.S && i12 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            boolean z12 = i12 == 12 && ((i11 = privacyControlActivity.I) != 1 ? !(i11 != 2 ? !(i11 == 0 && i10 == privacyControlActivity.T) : i10 != privacyControlActivity.S) : i10 == privacyControlActivity.S);
            bundle.putBoolean("allowMiniapps", z12);
            f70 f70Var = new f70(bundle);
            if (i12 == 10) {
                f70Var.L = LocaleController.getString(R.string.RemoveMessageFeeTitle);
            }
            if (i10 == privacyControlActivity.S) {
                if (privacyControlActivity.y[privacyControlActivity.I == 2 ? (char) 0 : (char) 1]) {
                    z10 = true;
                    if (z12 && privacyControlActivity.E[privacyControlActivity.I]) {
                        z11 = true;
                    }
                    f70Var.p0(arrayList, z10, z11);
                    f70Var.w = new dh.a(i10, privacyControlActivity, z12);
                    f70Var.e0 = true;
                    privacyControlActivity.presentFragment(f70Var);
                    return;
                }
            }
            z10 = false;
            if (z12) {
                z11 = true;
            }
            f70Var.p0(arrayList, z10, z11);
            f70Var.w = new dh.a(i10, privacyControlActivity, z12);
            f70Var.e0 = true;
            privacyControlActivity.presentFragment(f70Var);
            return;
        }
        if (i10 == privacyControlActivity.b0) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i10 == privacyControlActivity.readRow) {
            privacyControlActivity.B0 = !privacyControlActivity.B0;
            privacyControlActivity.E0();
            ((org.telegram.ui.Cells.w8) view).setChecked(privacyControlActivity.B0);
            return;
        }
        if (i10 == privacyControlActivity.e0) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i10 == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.D0 = !privacyControlActivity.D0;
            privacyControlActivity.E0();
            ((org.telegram.ui.Cells.w8) view).setChecked(privacyControlActivity.D0);
            return;
        }
        if (i10 == privacyControlActivity.m0) {
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i19 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i19;
                AndroidUtilities.shakeViewSpring(view, i19);
                privacyControlActivity.C0();
                return;
            }
            boolean u02 = privacyControlActivity.u0();
            privacyControlActivity.H0 = !privacyControlActivity.H0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setChecked(privacyControlActivity.H0);
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                w8Var.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (u02 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.l0) {
            if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i20 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i20;
                AndroidUtilities.shakeViewSpring(view, i20);
                privacyControlActivity.C0();
                return;
            }
            boolean u03 = privacyControlActivity.u0();
            privacyControlActivity.F0 = !privacyControlActivity.F0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
            w8Var2.setChecked(privacyControlActivity.F0);
            if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                w8Var2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (u03 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.n0) {
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i21 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i21;
                AndroidUtilities.shakeViewSpring(view, i21);
                privacyControlActivity.C0();
                return;
            }
            boolean u04 = privacyControlActivity.u0();
            privacyControlActivity.J0 = !privacyControlActivity.J0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
            w8Var3.setChecked(privacyControlActivity.J0);
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                w8Var3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (u04 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.o0) {
            if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i22 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i22;
                AndroidUtilities.shakeViewSpring(view, i22);
                privacyControlActivity.C0();
                return;
            }
            boolean u05 = privacyControlActivity.u0();
            privacyControlActivity.L0 = !privacyControlActivity.L0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.w8 w8Var4 = (org.telegram.ui.Cells.w8) view;
            w8Var4.setChecked(privacyControlActivity.L0);
            if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().isPremium()) {
                w8Var4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (u05 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.p0) {
            if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i23 = -privacyControlActivity.O0;
                privacyControlActivity.O0 = i23;
                AndroidUtilities.shakeViewSpring(view, i23);
                privacyControlActivity.C0();
                return;
            }
            boolean u06 = privacyControlActivity.u0();
            privacyControlActivity.N0 = !privacyControlActivity.N0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.w8 w8Var5 = (org.telegram.ui.Cells.w8) view;
            w8Var5.setChecked(privacyControlActivity.N0);
            if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().isPremium()) {
                w8Var5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (u06 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
            }
        }
    }

    public static void Y(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(privacyControlActivity).d0(tL_error, false);
            return;
        }
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.x0();
        }
    }

    public static /* synthetic */ void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            privacyControlActivity.B0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.x);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.x0();
        }
    }

    public final void A0() {
        ay0 ay0Var = this.e;
        if (ay0Var != null) {
            ay0Var.f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.I;
            if (i10 == 0) {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.e.f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.e.f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.e.f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.e.b.t2();
        }
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void C0() {
        org.telegram.ui.Components.yc.a0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new mx0(this, 0)).j();
    }

    public final void D0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.r8 r8Var = this.u0;
        if (r8Var != null) {
            if (this.x0 == null) {
                r8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.u0.setNeedDivider(false);
            } else {
                r8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.u0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.x9 x9Var = this.v0;
        if (x9Var == null || (photoSize = this.x0) == null) {
            return;
        }
        TLRPC.Photo photo = this.y0;
        if (photo != null) {
            x9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        } else {
            x9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
    }

    public final void E0() {
        boolean y02 = y0();
        this.c.setEnabled(y02);
        this.c.animate().alpha(y02 ? 1.0f : 0.0f).scaleX(y02 ? 1.0f : 0.0f).scaleY(y02 ? 1.0f : 0.0f).setDuration(180L).start();
    }

    public final void F0(boolean z10) {
        vx0 vx0Var;
        ArrayList arrayList;
        int i10;
        TLRPC.UserFull userFull;
        if (z10) {
            vx0Var = new vx0(this);
            vx0Var.f(vx0Var.c);
            vx0Var.b = this.r0;
        } else {
            vx0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.Z = -1;
        this.M = -1;
        this.setBirthdayRow = -1;
        this.Y = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.S = -1;
        this.T = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.P = -1;
        this.Q = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.R = -1;
        this.U = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.priceRow = -1;
        this.j0 = -1;
        this.i0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.showGiftIconRow = -1;
        this.k0 = -1;
        this.giftTypesHeaderRow = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = 0;
        int i11 = this.x;
        if (i11 == 12) {
            this.showGiftIconRow = 0;
            this.r0 = 2;
            this.k0 = 1;
        }
        if (i11 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i12 = this.r0;
            this.r0 = i12 + 1;
            this.setBirthdayRow = i12;
        }
        if (i11 == 5) {
            int i13 = this.r0;
            this.r0 = i13 + 1;
            this.M = i13;
        }
        int i14 = this.r0;
        this.N = i14;
        this.everybodyRow = i14 + 1;
        int i15 = i14 + 3;
        this.r0 = i15;
        this.O = i14 + 2;
        if (i11 == 4 || i11 == 9 || i11 == 14 || i11 == 0 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 1 || i11 == 11 || i11 == 12) {
            this.r0 = i14 + 4;
            this.nobodyRow = i15;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i11 == 10) {
            int i16 = this.r0;
            this.r0 = i16 + 1;
            this.g0 = i16;
        }
        if (i11 == 6 && this.I == 1) {
            int i17 = this.r0;
            this.Y = i17;
            this.V = i17 + 1;
            this.W = i17 + 2;
            this.r0 = i17 + 4;
            this.X = i17 + 3;
        }
        if (i11 == 10 && this.I == 3) {
            int i18 = this.r0;
            this.r0 = i18 + 1;
            this.Q = i18;
        } else {
            int i19 = this.r0;
            this.r0 = i19 + 1;
            this.P = i19;
        }
        if (i11 == 10) {
            if (this.I == 3) {
                int i20 = this.r0;
                this.h0 = i20;
                this.r0 = i20 + 2;
                this.priceRow = i20 + 1;
                if (!getUserConfig().isPremium()) {
                    int i21 = this.r0;
                    this.r0 = i21 + 1;
                    this.i0 = i21;
                }
                int i22 = this.r0;
                this.r0 = i22 + 1;
                this.j0 = i22;
                if (getUserConfig().isPremium()) {
                    int i23 = this.r0;
                    this.R = i23;
                    this.S = i23 + 1;
                    this.r0 = i23 + 3;
                    this.U = i23 + 2;
                }
            }
        } else if (i11 != 8 || getUserConfig().isPremium()) {
            int i24 = this.r0;
            int i25 = i24 + 1;
            this.r0 = i25;
            this.R = i24;
            int i26 = this.I;
            if (i26 == 1 || i26 == 2) {
                this.r0 = i24 + 2;
                this.S = i25;
            }
            if (i26 == 0 || i26 == 2) {
                int i27 = this.r0;
                this.r0 = i27 + 1;
                this.T = i27;
            }
            int i28 = this.r0;
            int i29 = i28 + 1;
            this.r0 = i29;
            this.U = i28;
            if (i11 == 2) {
                this.a0 = i29;
                this.b0 = i28 + 2;
                this.r0 = i28 + 4;
                this.c0 = i28 + 3;
            }
            if (i11 == 4 && (this.H.size() > 0 || (i10 = this.I) == 2 || i10 == 1)) {
                int i30 = this.r0;
                int i31 = i30 + 1;
                this.r0 = i31;
                this.photoForRestRow = i30;
                if (this.x0 != null) {
                    this.r0 = i30 + 2;
                    this.currentPhotoForRestRow = i31;
                }
                int i32 = this.r0;
                this.r0 = i32 + 1;
                this.Z = i32;
            }
            if (i11 == 0 && (this.I != 0 || ((arrayList = this.H) != null && !arrayList.isEmpty()))) {
                int i33 = this.r0;
                this.readRow = i33;
                this.r0 = i33 + 2;
                this.d0 = i33 + 1;
            }
            if (i11 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i34 = this.r0;
                this.e0 = i34;
                this.r0 = i34 + 2;
                this.f0 = i34 + 1;
            }
        }
        if (i11 == 12) {
            int i35 = this.r0;
            this.giftTypesHeaderRow = i35;
            this.m0 = i35 + 1;
            this.l0 = i35 + 2;
            this.n0 = i35 + 3;
            this.o0 = i35 + 4;
            this.p0 = i35 + 5;
            this.r0 = i35 + 7;
            this.q0 = i35 + 6;
        }
        A0();
        zx0 zx0Var = this.a;
        if (zx0Var != null) {
            if (!z10) {
                zx0Var.l();
                return;
            }
            int childCount = this.d.getChildCount();
            for (int i36 = 0; i36 < childCount; i36++) {
                View childAt = this.d.getChildAt(i36);
                if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Components.ll0 ll0Var = this.d;
                    View F = ll0Var.F(childAt);
                    s4.c1 T = F == null ? null : ll0Var.T(F);
                    if (T != null) {
                        int b10 = T.b();
                        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                        int i37 = this.everybodyRow;
                        if (b10 == i37 || b10 == this.O || b10 == this.nobodyRow || b10 == this.g0) {
                            j6Var.a(this.I == (b10 == i37 ? 0 : b10 == this.O ? 2 : b10 == this.nobodyRow ? 1 : 3), true);
                        } else {
                            j6Var.a(this.J == (b10 == this.X ? 1 : 0), true);
                        }
                    }
                }
            }
            vx0Var.f(vx0Var.d);
            s4.o.c(vx0Var, true).b(this.a);
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.tx0
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.x0 = photoSize3;
                privacyControlActivity.y0 = null;
                privacyControlActivity.D0();
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile3 != null || inputFile4 != null) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new m(privacyControlActivity, 18));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    org.telegram.ui.Components.yc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
                }
                privacyControlActivity.F0(false);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return v0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = this.x;
        if (i10 == 5) {
            ay0 ay0Var = new ay0(context);
            ay0Var.setWillNotDraw(false);
            ay0Var.setClipToPadding(false);
            ay0Var.d = org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
            ay0Var.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
            ay0Var.f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, this.currentAccount);
            ay0Var.b = t1Var;
            t1Var.setDelegate(new t7.u(17));
            t1Var.N7 = false;
            t1Var.setFullyDraw(true);
            t1Var.X3(messageObject, null, false, false, false, false);
            ay0Var.addView(t1Var, w7.x5.n(-1, -2));
            org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(1, context, null, true);
            ay0Var.e = i40Var;
            ay0Var.addView(i40Var, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.e = ay0Var;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (i10 == 6) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i10 == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i10 == 9) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i10 == 14) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i10 == 8) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i10 == 10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i10 == 11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i10 == 12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 21));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.sp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        this.b = orVar;
        this.c = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        boolean y02 = y0();
        this.c.setAlpha(y02 ? 1.0f : 0.0f);
        this.c.setScaleX(y02 ? 1.0f : 0.0f);
        this.c.setScaleY(y02 ? 1.0f : 0.0f);
        this.c.setEnabled(y02);
        this.a = new zx0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.d = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.d);
        this.d.setLayoutManager(new s4.c0(1, false));
        this.d.setVerticalScrollBarEnabled(false);
        ((s4.j) this.d.getItemAnimator()).C = false;
        frameLayout.addView(this.d, w7.x5.c(-1.0f, -1));
        this.d.setAdapter(this.a);
        this.d.setOnItemClickListener(new i(this, 26));
        ux0 ux0Var = new ux0(this);
        ux0Var.n(350L);
        ux0Var.o(org.telegram.ui.Components.pr.h);
        ux0Var.C = false;
        this.d.setItemAnimator(ux0Var);
        A0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ay0 ay0Var;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            w0();
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.e1();
        } else {
            if (i10 != NotificationCenter.didSetNewWallpapper || (ay0Var = this.e) == null) {
                return;
            }
            ay0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ cv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.j6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
        org.telegram.ui.Components.ll0 ll0Var = this.d;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.m3.y;
        int i13 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, null, null, drawableArr, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, org.telegram.ui.ActionBar.j6.q3.y, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Components.ll0 ll0Var2 = this.d;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.o3.y;
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var2, 0, null, null, drawableArr2, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, org.telegram.ui.ActionBar.j6.s3.y, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        return v0(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        F0(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d.setPadding(0, 0, 0, i13);
        this.d.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.u40 u40Var = this.s0;
        if (u40Var != null) {
            u40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        F0(false);
        org.telegram.ui.Components.u40 u40Var = this.s0;
        if (u40Var != null) {
            u40Var.l();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean t() {
        return false;
    }

    public final void t0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        int i10 = this.x;
        if (i10 == 10) {
            boolean[] zArr = {true, false};
            if (this.I == 3) {
                ArrayList arrayList = this.n;
                Collections.sort(arrayList);
                Collections.sort(this.G);
                if (!arrayList.equals(this.G)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.I != 0 && this.G.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i11 = 0; i11 < this.G.size(); i11++) {
                            Long l4 = (Long) this.G.get(i11);
                            long longValue = l4.longValue();
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                                if (user != null && (inputUser3 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new bc0(13, this, zArr));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                globalPrivacySettings2.flags = globalPrivacySettings.flags;
                globalPrivacySettings2.disallowed_stargifts = globalPrivacySettings.disallowed_stargifts;
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings2.noncontact_peers_paid_stars = globalPrivacySettings.noncontact_peers_paid_stars;
                globalPrivacySettings2.keep_archived_folders = globalPrivacySettings.keep_archived_folders;
                globalPrivacySettings2.keep_archived_unmuted = globalPrivacySettings.keep_archived_unmuted;
                globalPrivacySettings2.hide_read_marks = globalPrivacySettings.hide_read_marks;
            }
            int i12 = this.I;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.L;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i12 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.c3(this, zArr, globalPrivacySettings, setglobalprivacysettings, 11));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.I == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.J == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                final int i13 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) { // from class: org.telegram.ui.nx0
                    public final /* synthetic */ PrivacyControlActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i14 = 0;
                                final PrivacyControlActivity privacyControlActivity = this.b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.px0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                            default:
                                                PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i15 = 1;
                                final PrivacyControlActivity privacyControlActivity2 = this.b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.px0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                            default:
                                                PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i10 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i10 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i10 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i10 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i10 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i10 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i10 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i10 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i10 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i10 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.I != 0 && this.G.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i14 = 0; i14 < this.G.size(); i14++) {
                Long l10 = (Long) this.G.get(i14);
                long longValue2 = l10.longValue();
                if (DialogObject.isUserDialog(longValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user2 != null && (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user2)) != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(inputUser2);
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.I != 1 && this.H.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i15 = 0; i15 < this.H.size(); i15++) {
                Long l11 = (Long) this.H.get(i15);
                long longValue3 = l11.longValue();
                if (DialogObject.isUserDialog(longValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l11);
                    if (user3 != null && (inputUser = getMessagesController().getInputUser(user3)) != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i16 = this.I;
        if (i16 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i16 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i16 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i17 = this.I;
        if (i17 != 0) {
            if (this.y[i17 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i18 = this.I;
        if (this.E[i18]) {
            if (i18 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        final int i19 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) { // from class: org.telegram.ui.nx0
            public final /* synthetic */ PrivacyControlActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i19) {
                    case 0:
                        final int i142 = 0;
                        final PrivacyControlActivity privacyControlActivity = this.b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.px0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i142) {
                                    case 0:
                                        PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                    default:
                                        PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i152 = 1;
                        final PrivacyControlActivity privacyControlActivity2 = this.b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.px0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i152) {
                                    case 0:
                                        PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                    default:
                                        PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, 2);
        if (i10 != 0 || this.B0 == this.A0) {
            atomicInteger = atomicInteger2;
        } else {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.B0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            final int i20 = 0;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) { // from class: org.telegram.ui.ox0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            final int i21 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sx0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.A0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.x0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z11 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z11 != setglobalprivacysettings4.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.C0 = z12;
                                            globalPrivacySettings8.display_gifts_button = z12;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.E0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.M0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i22 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sx0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i22) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.A0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.C0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.E0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.M0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (i10 == 12 && (this.D0 != this.C0 || this.H0 != this.G0 || this.F0 != this.E0 || this.J0 != this.I0 || this.N0 != this.M0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = this.D0;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.F0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.H0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.J0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.N0;
            }
            final int i21 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) { // from class: org.telegram.ui.ox0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i21) {
                        case 0:
                            final int i212 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sx0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i212) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.A0 = z10;
                                            globalPrivacySettings72.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.C0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.E0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.M0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i22 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sx0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i22) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.A0 = z10;
                                            globalPrivacySettings82.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z11 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.C0 = z12;
                                            globalPrivacySettings822.display_gifts_button = z12;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.E0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.M0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.b.a(1.0f);
        }
    }

    public final boolean u0() {
        return (this.J0 || this.F0 || this.H0) ? false : true;
    }

    public final boolean v0(boolean z10) {
        if (this.c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new qx0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new qx0(this, 2));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    public final void w0() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i10;
        int i11;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.n;
        int i12 = this.x;
        if (i12 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            int i13 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.I = i13;
            this.f = i13;
            this.H = new ArrayList();
            this.G = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.L = 10L;
                this.K = 10L;
            } else {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.L = clamp;
                this.K = clamp;
                this.I = 3;
                this.f = 3;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.G = new ArrayList();
            if (privacyRules != null) {
                for (int i14 = 0; i14 < privacyRules.size(); i14++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i14);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i15 = 0;
                        while (i15 < size) {
                            i15 = com.google.android.gms.internal.vision.e2.g(-tL_privacyValueAllowChatParticipants.chats.get(i15).longValue(), this.G, i15, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.G.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.G);
            return;
        }
        boolean z10 = i12 == 1;
        boolean[] zArr4 = this.s;
        zArr4[0] = z10;
        boolean[] zArr5 = this.y;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.v;
        zArr6[0] = false;
        boolean[] zArr7 = this.E;
        zArr7[0] = false;
        boolean z11 = i12 == 12;
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.w;
        zArr8[0] = false;
        boolean[] zArr9 = this.F;
        zArr9[0] = false;
        boolean z12 = i12 == 12;
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.G = new ArrayList();
        this.H = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i12);
        if (privacyRules2 == null || privacyRules2.size() == 0) {
            this.I = 1;
        } else {
            Boolean bool2 = null;
            char c10 = 65535;
            int i16 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i16 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i16);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        i17 = com.google.android.gms.internal.vision.e2.g(-tL_privacyValueAllowChatParticipants2.chats.get(i17).longValue(), this.G, i17, 1);
                        zArr6 = zArr6;
                        privacyRules2 = privacyRules2;
                        tL_privacyValueAllowChatParticipants2 = tL_privacyValueAllowChatParticipants2;
                        zArr4 = zArr4;
                    }
                    zArr = zArr6;
                    arrayList = privacyRules2;
                    zArr2 = zArr4;
                } else {
                    zArr = zArr6;
                    arrayList = privacyRules2;
                    zArr2 = zArr4;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int i18 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i18 < size3; size3 = size3) {
                            i18 = com.google.android.gms.internal.vision.e2.g(-tL_privacyValueDisallowChatParticipants.chats.get(i18).longValue(), this.H, i18, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.G.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.H.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z13 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z15 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z15) {
                                    boolean z16 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z16 || z14) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c10 = 2;
                                            z14 = true;
                                        } else if (c10 == 65535) {
                                            if (!z15) {
                                                if (!z16 || z14) {
                                                    c10 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c10 = 1;
                                }
                                c10 = 0;
                            }
                            bool2 = bool;
                        }
                        i16++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        privacyRules2 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i16++;
                zArr5 = zArr3;
                zArr6 = zArr;
                privacyRules2 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c10 == 0 || (c10 == 65535 && (this.H.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i10 = 2;
                this.I = 0;
            } else {
                i10 = 2;
                if (c10 != 2) {
                    if (c10 != 65535 || this.H.size() <= 0 || this.G.size() <= 0) {
                        if (c10 != 1) {
                            i11 = (c10 == 65535 && (this.G.size() > 0 || (bool2 != null && bool2.booleanValue()))) ? 1 : 1;
                            i10 = 2;
                        }
                        this.I = i11;
                        i10 = 2;
                    } else {
                        i10 = 2;
                    }
                }
                this.I = i10;
            }
            int i19 = this.I;
            char c11 = i19 == i10 ? (char) 0 : (char) 1;
            zArr11[c11] = z13;
            zArr12[c11] = z13;
            boolean z17 = bool2 != null;
            zArr10[i19] = z17;
            zArr7[i19] = z17;
            zArr8[i19] = false;
            zArr9[i19] = false;
            org.telegram.ui.ActionBar.v0 v0Var = this.c;
            if (v0Var != null) {
                v0Var.setAlpha(0.0f);
                this.c.setScaleX(0.0f);
                this.c.setScaleY(0.0f);
                this.c.setEnabled(false);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.r;
        arrayList3.clear();
        this.f = this.I;
        arrayList2.addAll(this.G);
        arrayList3.addAll(this.H);
        if (i12 == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 == null || privacyRules3.size() == 0) {
                this.J = 0;
            } else {
                int i20 = 0;
                while (true) {
                    if (i20 >= privacyRules3.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i20);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.J = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.J = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.J = 1;
                            break;
                        }
                        i20++;
                    }
                }
            }
            this.h = this.J;
        }
        if (i12 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            boolean z18 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.A0 = z18;
            this.B0 = z18;
        }
        if (i12 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            boolean z19 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.C0 = z19;
            this.D0 = z19;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.F0 = true;
                this.E0 = true;
                this.H0 = true;
                this.G0 = true;
                this.J0 = true;
                this.I0 = true;
                this.L0 = true;
                this.K0 = true;
                this.N0 = true;
                this.M0 = true;
            } else {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.F0 = z20;
                this.E0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.H0 = z21;
                this.G0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.J0 = z22;
                this.I0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.L0 = z23;
                this.K0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.N0 = z24;
                this.M0 = z24;
            }
        }
        F0(false);
        AndroidUtilities.updateVisibleRows(this.d);
    }

    public final void x0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.b.a(0.0f);
        int i10 = this.x;
        if ((i10 == 10 || i10 == 1 || i10 == 2) && this.I != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = iArr[i11];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i12);
                if (i12 != i10 && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.resourceProvider);
                    alertDialog$Builder.a.R = LocaleController.getString(i12 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(i12 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new i2.t(this, i12, 16));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qx0(this, 1));
                    alertDialog$Builder.o();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean y0() {
        ArrayList arrayList;
        int i10 = this.x;
        if (i10 == 0 && ((this.I != 0 || ((arrayList = this.H) != null && !arrayList.isEmpty())) && this.A0 != this.B0)) {
            return true;
        }
        if (i10 == 12 && (this.C0 != this.D0 || this.G0 != this.H0 || this.E0 != this.F0 || this.I0 != this.J0 || this.K0 != this.L0 || this.M0 != this.N0)) {
            return true;
        }
        int i11 = this.f;
        int i12 = this.I;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.h != this.J) {
            return true;
        }
        if (i12 != 0) {
            if (this.s[i12 == 2 ? (char) 0 : (char) 1] != this.y[i12 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.L != this.K) || this.v[i12] != this.E[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.r;
        if (arrayList2.size() != this.H.size()) {
            return true;
        }
        ArrayList arrayList3 = this.n;
        if (arrayList3.size() != this.G.size()) {
            return true;
        }
        if (i10 != 10 || this.I == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.G);
            if (!arrayList3.equals(this.G)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.H);
            if (!arrayList2.equals(this.H)) {
                return true;
            }
        }
        return false;
    }

    public final void z0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.x;
        if (i10 == 10 && this.I == 3 && !getUserConfig().isPremium()) {
            showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) this, 27, true));
            return;
        }
        if (this.I != 0 && i10 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i10 == 1) {
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qv0(3, this, globalMainSettings));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder.a);
                return;
            }
        }
        t0();
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void C(float f7) {
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
    }
}
