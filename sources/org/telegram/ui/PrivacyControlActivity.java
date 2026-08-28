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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public final boolean[] A;
    public boolean A0;
    public final boolean[] B;
    public boolean B0;
    public ArrayList C;
    public boolean C0;
    public ArrayList D;
    public boolean D0;
    public int E;
    public boolean E0;
    public int F;
    public boolean F0;
    public long G;
    public boolean G0;
    public long H;
    public boolean H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public int K0;
    public int L;
    public int M;
    public int N;
    public int O;
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
    public uw0 a;
    public int a0;
    public org.telegram.ui.Components.fr b;
    public int b0;
    public org.telegram.ui.ActionBar.w0 c;
    public int c0;
    private int currentPhotoForRestRow;
    public org.telegram.ui.Components.wk0 d;
    public int d0;
    public vw0 e;
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
    public final org.telegram.ui.Components.e40 o0;
    public org.telegram.ui.Components.mi0 p0;
    private int photoForRestRow;
    private int priceRow;
    public org.telegram.ui.Cells.p8 q0;
    public final ArrayList r;
    public org.telegram.ui.Components.o9 r0;
    private int readRow;
    public final boolean[] s;
    public gs s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public TLRPC.PhotoSize t0;
    public TLRPC.Photo u0;
    public final boolean[] v;
    public SpannableString v0;
    public final boolean[] w;
    public boolean w0;
    public final int x;
    public boolean x0;
    public final boolean[] y;
    public boolean y0;
    public boolean z0;

    public PrivacyControlActivity(int i9, boolean z10) {
        super(null);
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = new boolean[4];
        this.v = new boolean[4];
        this.w = new boolean[4];
        this.y = new boolean[4];
        this.A = new boolean[4];
        this.B = new boolean[4];
        this.H = 10L;
        this.K0 = 4;
        this.x = i9;
        if (z10) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i9 == 4) {
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
            this.o0 = e40Var;
            e40Var.a = this;
            e40Var.b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) {
                return;
            }
            this.t0 = closestPhotoSizeWithSize;
            this.u0 = userFull.fallback_photo;
        }
    }

    public static /* synthetic */ void T(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.t0 = null;
        privacyControlActivity.u0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull == null || (photo = userFull.fallback_photo) == null) {
            return;
        }
        userFull.flags &= -4194305;
        userFull.fallback_photo = null;
        privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
        privacyControlActivity.C0();
        privacyControlActivity.E0(true);
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

    public static /* synthetic */ void U(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            privacyControlActivity.A0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, 13);
        AndroidUtilities.runOnUIThread(new ys0(7, privacyControlActivity, zArr));
    }

    public static /* synthetic */ void V(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
            userFull.flags |= TLObject.FLAG_22;
            userFull.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && privacyControlActivity.t0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.t0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.t0.location.volume_id);
                sb2.append("_");
                String l10 = aa.d.l(privacyControlActivity.t0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || privacyControlActivity.t0 == null) {
                return;
            }
            FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.t0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    public static void W(PrivacyControlActivity privacyControlActivity, View view, int i9) {
        boolean z10;
        int i10;
        int i11 = privacyControlActivity.x;
        if (i9 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new iw0(privacyControlActivity, 1), null).a;
            c2Var.show();
            c2Var.h();
            return;
        }
        int i12 = 0;
        r2 = false;
        boolean z11 = false;
        if (i9 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.e40 e40Var = privacyControlActivity.o0;
            if (e40Var != null) {
                e40Var.o(false, new bg.d2(23), new r5(privacyControlActivity, 13), 0);
                privacyControlActivity.p0.K(0);
                privacyControlActivity.p0.N(43);
                privacyControlActivity.q0.e.d();
                return;
            }
            return;
        }
        if (i11 == 10 && i9 == privacyControlActivity.K && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.oc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i13 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i13;
            AndroidUtilities.shakeViewSpring(view, i13);
            return;
        }
        if (i11 == 8 && ((i9 == privacyControlActivity.K || i9 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.oc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i14 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i14;
            AndroidUtilities.shakeViewSpring(view, i14);
            return;
        }
        if (i9 == privacyControlActivity.nobodyRow || i9 == privacyControlActivity.everybodyRow || i9 == privacyControlActivity.K || i9 == privacyControlActivity.c0) {
            if (i11 == 12 && privacyControlActivity.t0()) {
                int i15 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i15;
                AndroidUtilities.shakeViewSpring(view, i15);
                return;
            }
            if (i9 == privacyControlActivity.nobodyRow) {
                i12 = 1;
            } else if (i9 != privacyControlActivity.everybodyRow) {
                i12 = i9 == privacyControlActivity.c0 ? 3 : 2;
            }
            if (i12 == privacyControlActivity.E) {
                return;
            }
            privacyControlActivity.E = i12;
            org.telegram.ui.Components.gc.e();
            privacyControlActivity.D0();
            privacyControlActivity.E0(true);
            return;
        }
        if (i9 == privacyControlActivity.T || i9 == privacyControlActivity.S) {
            int i16 = i9 != privacyControlActivity.S ? 1 : 0;
            if (i16 == privacyControlActivity.F) {
                return;
            }
            privacyControlActivity.F = i16;
            privacyControlActivity.D0();
            privacyControlActivity.E0(true);
            return;
        }
        if (i9 == privacyControlActivity.P || i9 == privacyControlActivity.O) {
            if (i11 == 12 && privacyControlActivity.t0()) {
                int i17 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i17;
                AndroidUtilities.shakeViewSpring(view, i17);
                return;
            }
            ArrayList arrayList = i9 == privacyControlActivity.P ? privacyControlActivity.D : privacyControlActivity.C;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i9 == privacyControlActivity.P ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i11 != 0 ? 1 : 0);
            if (i9 == privacyControlActivity.O && i11 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            boolean z12 = i11 == 12 && ((i10 = privacyControlActivity.E) != 1 ? !(i10 != 2 ? !(i10 == 0 && i9 == privacyControlActivity.P) : i9 != privacyControlActivity.O) : i9 == privacyControlActivity.O);
            bundle.putBoolean("allowMiniapps", z12);
            k60 k60Var = new k60(bundle);
            if (i11 == 10) {
                k60Var.H = LocaleController.getString(R.string.RemoveMessageFeeTitle);
            }
            if (i9 == privacyControlActivity.O) {
                if (privacyControlActivity.y[privacyControlActivity.E == 2 ? (char) 0 : (char) 1]) {
                    z10 = true;
                    if (z12 && privacyControlActivity.A[privacyControlActivity.E]) {
                        z11 = true;
                    }
                    k60Var.o0(arrayList, z10, z11);
                    k60Var.w = new kg.a(i9, privacyControlActivity, z12);
                    k60Var.a0 = true;
                    privacyControlActivity.presentFragment(k60Var);
                    return;
                }
            }
            z10 = false;
            if (z12) {
                z11 = true;
            }
            k60Var.o0(arrayList, z10, z11);
            k60Var.w = new kg.a(i9, privacyControlActivity, z12);
            k60Var.a0 = true;
            privacyControlActivity.presentFragment(k60Var);
            return;
        }
        if (i9 == privacyControlActivity.X) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i9 == privacyControlActivity.readRow) {
            privacyControlActivity.x0 = !privacyControlActivity.x0;
            privacyControlActivity.D0();
            ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.x0);
            return;
        }
        if (i9 == privacyControlActivity.a0) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i9 == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.z0 = !privacyControlActivity.z0;
            privacyControlActivity.D0();
            ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.z0);
            return;
        }
        if (i9 == privacyControlActivity.i0) {
            if (privacyControlActivity.D0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i18 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i18;
                AndroidUtilities.shakeViewSpring(view, i18);
                privacyControlActivity.B0();
                return;
            }
            boolean t02 = privacyControlActivity.t0();
            privacyControlActivity.D0 = !privacyControlActivity.D0;
            privacyControlActivity.D0();
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setChecked(privacyControlActivity.D0);
            if (privacyControlActivity.D0 && !privacyControlActivity.getUserConfig().isPremium()) {
                t8Var.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (t02 != privacyControlActivity.t0()) {
                privacyControlActivity.E0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i9 == privacyControlActivity.h0) {
            if (privacyControlActivity.B0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i19 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i19;
                AndroidUtilities.shakeViewSpring(view, i19);
                privacyControlActivity.B0();
                return;
            }
            boolean t03 = privacyControlActivity.t0();
            privacyControlActivity.B0 = !privacyControlActivity.B0;
            privacyControlActivity.D0();
            org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
            t8Var2.setChecked(privacyControlActivity.B0);
            if (privacyControlActivity.B0 && !privacyControlActivity.getUserConfig().isPremium()) {
                t8Var2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (t03 != privacyControlActivity.t0()) {
                privacyControlActivity.E0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i9 == privacyControlActivity.j0) {
            if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i20 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i20;
                AndroidUtilities.shakeViewSpring(view, i20);
                privacyControlActivity.B0();
                return;
            }
            boolean t04 = privacyControlActivity.t0();
            privacyControlActivity.F0 = !privacyControlActivity.F0;
            privacyControlActivity.D0();
            org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
            t8Var3.setChecked(privacyControlActivity.F0);
            if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                t8Var3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (t04 != privacyControlActivity.t0()) {
                privacyControlActivity.E0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i9 == privacyControlActivity.k0) {
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i21 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i21;
                AndroidUtilities.shakeViewSpring(view, i21);
                privacyControlActivity.B0();
                return;
            }
            boolean t05 = privacyControlActivity.t0();
            privacyControlActivity.H0 = !privacyControlActivity.H0;
            privacyControlActivity.D0();
            org.telegram.ui.Cells.t8 t8Var4 = (org.telegram.ui.Cells.t8) view;
            t8Var4.setChecked(privacyControlActivity.H0);
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                t8Var4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (t05 != privacyControlActivity.t0()) {
                privacyControlActivity.E0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i9 == privacyControlActivity.l0) {
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i22 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i22;
                AndroidUtilities.shakeViewSpring(view, i22);
                privacyControlActivity.B0();
                return;
            }
            boolean t06 = privacyControlActivity.t0();
            privacyControlActivity.J0 = !privacyControlActivity.J0;
            privacyControlActivity.D0();
            org.telegram.ui.Cells.t8 t8Var5 = (org.telegram.ui.Cells.t8) view;
            t8Var5.setChecked(privacyControlActivity.J0);
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                t8Var5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (t06 != privacyControlActivity.t0()) {
                privacyControlActivity.E0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
            }
        }
    }

    public static void X(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            org.telegram.ui.Components.oc.a0(privacyControlActivity).d0(tL_error, false);
            return;
        }
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.w0();
        }
    }

    public static /* synthetic */ void Y(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            privacyControlActivity.A0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.x);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.w0();
        }
    }

    public final void A0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void B0() {
        org.telegram.ui.Components.oc.a0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(this, 0)).j();
    }

    public final void C0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.p8 p8Var = this.q0;
        if (p8Var != null) {
            if (this.t0 == null) {
                p8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.q0.setNeedDivider(false);
            } else {
                p8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.q0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.o9 o9Var = this.r0;
        if (o9Var == null || (photoSize = this.t0) == null) {
            return;
        }
        TLRPC.Photo photo = this.u0;
        if (photo != null) {
            o9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        } else {
            o9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
    }

    public final void D0() {
        boolean x02 = x0();
        this.c.setEnabled(x02);
        this.c.animate().alpha(x02 ? 1.0f : 0.0f).scaleX(x02 ? 1.0f : 0.0f).scaleY(x02 ? 1.0f : 0.0f).setDuration(180L).start();
    }

    public final void E0(boolean z10) {
        qw0 qw0Var;
        ArrayList arrayList;
        int i9;
        TLRPC.UserFull userFull;
        if (z10) {
            qw0Var = new qw0(this);
            qw0Var.f(qw0Var.c);
            qw0Var.b = this.n0;
        } else {
            qw0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.V = -1;
        this.I = -1;
        this.setBirthdayRow = -1;
        this.U = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.O = -1;
        this.P = -1;
        this.W = -1;
        this.X = -1;
        this.L = -1;
        this.M = -1;
        this.Y = -1;
        this.Z = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.N = -1;
        this.Q = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.priceRow = -1;
        this.f0 = -1;
        this.e0 = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.showGiftIconRow = -1;
        this.g0 = -1;
        this.giftTypesHeaderRow = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = 0;
        int i10 = this.x;
        if (i10 == 12) {
            this.showGiftIconRow = 0;
            this.n0 = 2;
            this.g0 = 1;
        }
        if (i10 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i11 = this.n0;
            this.n0 = i11 + 1;
            this.setBirthdayRow = i11;
        }
        if (i10 == 5) {
            int i12 = this.n0;
            this.n0 = i12 + 1;
            this.I = i12;
        }
        int i13 = this.n0;
        this.J = i13;
        this.everybodyRow = i13 + 1;
        int i14 = i13 + 3;
        this.n0 = i14;
        this.K = i13 + 2;
        if (i10 == 4 || i10 == 9 || i10 == 14 || i10 == 0 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 1 || i10 == 11 || i10 == 12) {
            this.n0 = i13 + 4;
            this.nobodyRow = i14;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i10 == 10) {
            int i15 = this.n0;
            this.n0 = i15 + 1;
            this.c0 = i15;
        }
        if (i10 == 6 && this.E == 1) {
            int i16 = this.n0;
            this.U = i16;
            this.R = i16 + 1;
            this.S = i16 + 2;
            this.n0 = i16 + 4;
            this.T = i16 + 3;
        }
        if (i10 == 10 && this.E == 3) {
            int i17 = this.n0;
            this.n0 = i17 + 1;
            this.M = i17;
        } else {
            int i18 = this.n0;
            this.n0 = i18 + 1;
            this.L = i18;
        }
        if (i10 == 10) {
            if (this.E == 3) {
                int i19 = this.n0;
                this.d0 = i19;
                this.n0 = i19 + 2;
                this.priceRow = i19 + 1;
                if (!getUserConfig().isPremium()) {
                    int i20 = this.n0;
                    this.n0 = i20 + 1;
                    this.e0 = i20;
                }
                int i21 = this.n0;
                this.n0 = i21 + 1;
                this.f0 = i21;
                if (getUserConfig().isPremium()) {
                    int i22 = this.n0;
                    this.N = i22;
                    this.O = i22 + 1;
                    this.n0 = i22 + 3;
                    this.Q = i22 + 2;
                }
            }
        } else if (i10 != 8 || getUserConfig().isPremium()) {
            int i23 = this.n0;
            int i24 = i23 + 1;
            this.n0 = i24;
            this.N = i23;
            int i25 = this.E;
            if (i25 == 1 || i25 == 2) {
                this.n0 = i23 + 2;
                this.O = i24;
            }
            if (i25 == 0 || i25 == 2) {
                int i26 = this.n0;
                this.n0 = i26 + 1;
                this.P = i26;
            }
            int i27 = this.n0;
            int i28 = i27 + 1;
            this.n0 = i28;
            this.Q = i27;
            if (i10 == 2) {
                this.W = i28;
                this.X = i27 + 2;
                this.n0 = i27 + 4;
                this.Y = i27 + 3;
            }
            if (i10 == 4 && (this.D.size() > 0 || (i9 = this.E) == 2 || i9 == 1)) {
                int i29 = this.n0;
                int i30 = i29 + 1;
                this.n0 = i30;
                this.photoForRestRow = i29;
                if (this.t0 != null) {
                    this.n0 = i29 + 2;
                    this.currentPhotoForRestRow = i30;
                }
                int i31 = this.n0;
                this.n0 = i31 + 1;
                this.V = i31;
            }
            if (i10 == 0 && (this.E != 0 || ((arrayList = this.D) != null && !arrayList.isEmpty()))) {
                int i32 = this.n0;
                this.readRow = i32;
                this.n0 = i32 + 2;
                this.Z = i32 + 1;
            }
            if (i10 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i33 = this.n0;
                this.a0 = i33;
                this.n0 = i33 + 2;
                this.b0 = i33 + 1;
            }
        }
        if (i10 == 12) {
            int i34 = this.n0;
            this.giftTypesHeaderRow = i34;
            this.i0 = i34 + 1;
            this.h0 = i34 + 2;
            this.j0 = i34 + 3;
            this.k0 = i34 + 4;
            this.l0 = i34 + 5;
            this.n0 = i34 + 7;
            this.m0 = i34 + 6;
        }
        z0();
        uw0 uw0Var = this.a;
        if (uw0Var != null) {
            if (!z10) {
                uw0Var.l();
                return;
            }
            int childCount = this.d.getChildCount();
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt = this.d.getChildAt(i35);
                if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Components.wk0 wk0Var = this.d;
                    View F = wk0Var.F(childAt);
                    f2.q1 T = F == null ? null : wk0Var.T(F);
                    if (T != null) {
                        int b10 = T.b();
                        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                        int i36 = this.everybodyRow;
                        if (b10 == i36 || b10 == this.K || b10 == this.nobodyRow || b10 == this.c0) {
                            j6Var.a(this.E == (b10 == i36 ? 0 : b10 == this.K ? 2 : b10 == this.nobodyRow ? 1 : 3), true);
                        } else {
                            j6Var.a(this.F == (b10 == this.T ? 1 : 0), true);
                        }
                    }
                }
            }
            qw0Var.f(qw0Var.d);
            f2.s.c(qw0Var, true).b(this.a);
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.t0 = photoSize3;
                privacyControlActivity.u0 = null;
                privacyControlActivity.C0();
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
                        int i9 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i9 | 6;
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
                    org.telegram.ui.Components.oc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
                }
                privacyControlActivity.E0(false);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        return u0(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9 = this.x;
        if (i9 == 5) {
            vw0 vw0Var = new vw0(context);
            vw0Var.setWillNotDraw(false);
            vw0Var.setClipToPadding(false);
            vw0Var.d = org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7);
            vw0Var.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
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
            vw0Var.f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, this.currentAccount);
            vw0Var.b = t1Var;
            t1Var.setDelegate(new wa.a(19));
            t1Var.J7 = false;
            t1Var.setFullyDraw(true);
            t1Var.X3(messageObject, null, false, false, false, false);
            vw0Var.addView(t1Var, g7.e6.n(-1, -2));
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, context, null, true);
            vw0Var.e = s30Var;
            vw0Var.addView(s30Var, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.e = vw0Var;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (i9 == 6) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i9 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i9 == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i9 == 9) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i9 == 14) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i9 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i9 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i9 == 8) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i9 == 10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i9 == 11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i9 == 12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 15));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        this.b = frVar;
        this.c = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        boolean x02 = x0();
        this.c.setAlpha(x02 ? 1.0f : 0.0f);
        this.c.setScaleX(x02 ? 1.0f : 0.0f);
        this.c.setScaleY(x02 ? 1.0f : 0.0f);
        this.c.setEnabled(x02);
        this.a = new uw0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.d = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.d);
        this.d.setLayoutManager(new f2.m0(1, false));
        this.d.setVerticalScrollBarEnabled(false);
        ((f2.n) this.d.getItemAnimator()).C = false;
        frameLayout.addView(this.d, g7.e6.c(-1.0f, -1));
        this.d.setAdapter(this.a);
        this.d.setOnItemClickListener(new i(this, 25));
        pw0 pw0Var = new pw0(this);
        pw0Var.n(350L);
        pw0Var.o(org.telegram.ui.Components.gr.h);
        pw0Var.C = false;
        this.d.setItemAnimator(pw0Var);
        z0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        vw0 vw0Var;
        if (i9 == NotificationCenter.privacyRulesUpdated) {
            v0();
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            this.d.f1();
        } else {
            if (i9 != NotificationCenter.didSetNewWallpapper || (vw0Var = this.e) == null) {
                return;
            }
            vw0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i11 = org.telegram.ui.ActionBar.f6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m3, org.telegram.ui.ActionBar.f6.q3}, null, org.telegram.ui.ActionBar.f6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.n3, org.telegram.ui.ActionBar.f6.r3}, null, org.telegram.ui.ActionBar.f6.dc));
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.m3.y;
        int i12 = org.telegram.ui.ActionBar.f6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, null, null, drawableArr, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, org.telegram.ui.ActionBar.f6.q3.y, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.p3, org.telegram.ui.ActionBar.f6.t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        org.telegram.ui.Components.wk0 wk0Var2 = this.d;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.o3.y;
        int i13 = org.telegram.ui.ActionBar.f6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var2, 0, null, null, drawableArr2, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, org.telegram.ui.ActionBar.f6.s3.y, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nb));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        return u0(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        v0();
        E0(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.d.setPadding(0, 0, 0, i12);
        this.d.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.e40 e40Var = this.o0;
        if (e40Var != null) {
            e40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        E0(false);
        org.telegram.ui.Components.e40 e40Var = this.o0;
        if (e40Var != null) {
            e40Var.l();
        }
    }

    public final void s0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        int i9 = this.x;
        if (i9 == 10) {
            boolean[] zArr = {true, false};
            if (this.E == 3) {
                ArrayList arrayList = this.n;
                Collections.sort(arrayList);
                Collections.sort(this.C);
                if (!arrayList.equals(this.C)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.E != 0 && this.C.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i10 = 0; i10 < this.C.size(); i10++) {
                            Long l10 = (Long) this.C.get(i10);
                            long longValue = l10.longValue();
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
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
                    getConnectionsManager().sendRequest(setprivacy, new v40(20, this, zArr));
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
            int i11 = this.E;
            if (i11 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.H;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i11 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new fh.h1(this, zArr, globalPrivacySettings, setglobalprivacysettings, 17));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i9 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.E == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.F == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                final int i12 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) { // from class: org.telegram.ui.jw0
                    public final /* synthetic */ PrivacyControlActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i12) {
                            case 0:
                                final int i13 = 0;
                                final PrivacyControlActivity privacyControlActivity = this.b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lw0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                PrivacyControlActivity.X(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                            default:
                                                PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i14 = 1;
                                final PrivacyControlActivity privacyControlActivity2 = this.b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lw0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                PrivacyControlActivity.X(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                            default:
                                                PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i9 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i9 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i9 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i9 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i9 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i9 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i9 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i9 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i9 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i9 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.E != 0 && this.C.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.C.size(); i13++) {
                Long l11 = (Long) this.C.get(i13);
                long longValue2 = l11.longValue();
                if (DialogObject.isUserDialog(longValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l11);
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
        if (this.E != 1 && this.D.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.D.size(); i14++) {
                Long l12 = (Long) this.D.get(i14);
                long longValue3 = l12.longValue();
                if (DialogObject.isUserDialog(longValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l12);
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
        int i15 = this.E;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.E;
        if (i16 != 0) {
            if (this.y[i16 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.E;
        if (this.A[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        final int i18 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) { // from class: org.telegram.ui.jw0
            public final /* synthetic */ PrivacyControlActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i18) {
                    case 0:
                        final int i132 = 0;
                        final PrivacyControlActivity privacyControlActivity = this.b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lw0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i132) {
                                    case 0:
                                        PrivacyControlActivity.X(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                    default:
                                        PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i142 = 1;
                        final PrivacyControlActivity privacyControlActivity2 = this.b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lw0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i142) {
                                    case 0:
                                        PrivacyControlActivity.X(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                    default:
                                        PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, 2);
        if (i9 != 0 || this.x0 == this.w0) {
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
            globalPrivacySettings6.hide_read_marks = this.x0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            final int i19 = 0;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) { // from class: org.telegram.ui.kw0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i19) {
                        case 0:
                            final int i20 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nw0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i20) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.w0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.w0();
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
                                            privacyControlActivity3.y0 = z12;
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
                                                privacyControlActivity3.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.I0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i21 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nw0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.w0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.w0();
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
                                            privacyControlActivity3.y0 = z12;
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
                                                privacyControlActivity3.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.I0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
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
        if (i9 == 12 && (this.z0 != this.y0 || this.D0 != this.C0 || this.B0 != this.A0 || this.F0 != this.E0 || this.J0 != this.I0)) {
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
            globalPrivacySettings8.display_gifts_button = this.z0;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.B0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.D0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.F0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.J0;
            }
            final int i20 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) { // from class: org.telegram.ui.kw0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            final int i202 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nw0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i202) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.w0 = z10;
                                            globalPrivacySettings72.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.w0();
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
                                            privacyControlActivity3.y0 = z12;
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
                                                privacyControlActivity3.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.I0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i21 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nw0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.w0 = z10;
                                            globalPrivacySettings82.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.w0();
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
                                            privacyControlActivity3.y0 = z12;
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
                                                privacyControlActivity3.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.I0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
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

    public final boolean t0() {
        return (this.F0 || this.B0 || this.D0) ? false : true;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    public final boolean u0(boolean z10) {
        if (this.c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mw0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new mw0(this, 2));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    public final void v0() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i9;
        int i10;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.n;
        int i11 = this.x;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            int i12 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.E = i12;
            this.f = i12;
            this.D = new ArrayList();
            this.C = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.H = 10L;
                this.G = 10L;
            } else {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.H = clamp;
                this.G = clamp;
                this.E = 3;
                this.f = 3;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.C = new ArrayList();
            if (privacyRules != null) {
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = aa.d.g(-tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.C, i14, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.C.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.C);
            return;
        }
        boolean z10 = i11 == 1;
        boolean[] zArr4 = this.s;
        zArr4[0] = z10;
        boolean[] zArr5 = this.y;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.v;
        zArr6[0] = false;
        boolean[] zArr7 = this.A;
        zArr7[0] = false;
        boolean z11 = i11 == 12;
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.w;
        zArr8[0] = false;
        boolean[] zArr9 = this.B;
        zArr9[0] = false;
        boolean z12 = i11 == 12;
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.C = new ArrayList();
        this.D = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i11);
        if (privacyRules2 == null || privacyRules2.size() == 0) {
            this.E = 1;
        } else {
            Boolean bool2 = null;
            char c10 = 65535;
            int i15 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i15 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i15);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        i16 = aa.d.g(-tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.C, i16, 1);
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
                        int i17 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i17 < size3; size3 = size3) {
                            i17 = aa.d.g(-tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.D, i17, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.C.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.D.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
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
                        i15++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        privacyRules2 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i15++;
                zArr5 = zArr3;
                zArr6 = zArr;
                privacyRules2 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c10 == 0 || (c10 == 65535 && (this.D.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i9 = 2;
                this.E = 0;
            } else {
                i9 = 2;
                if (c10 != 2) {
                    if (c10 != 65535 || this.D.size() <= 0 || this.C.size() <= 0) {
                        if (c10 != 1) {
                            i10 = (c10 == 65535 && (this.C.size() > 0 || (bool2 != null && bool2.booleanValue()))) ? 1 : 1;
                            i9 = 2;
                        }
                        this.E = i10;
                        i9 = 2;
                    } else {
                        i9 = 2;
                    }
                }
                this.E = i9;
            }
            int i18 = this.E;
            char c11 = i18 == i9 ? (char) 0 : (char) 1;
            zArr11[c11] = z13;
            zArr12[c11] = z13;
            boolean z17 = bool2 != null;
            zArr10[i18] = z17;
            zArr7[i18] = z17;
            zArr8[i18] = false;
            zArr9[i18] = false;
            org.telegram.ui.ActionBar.w0 w0Var = this.c;
            if (w0Var != null) {
                w0Var.setAlpha(0.0f);
                this.c.setScaleX(0.0f);
                this.c.setScaleY(0.0f);
                this.c.setEnabled(false);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.r;
        arrayList3.clear();
        this.f = this.E;
        arrayList2.addAll(this.C);
        arrayList3.addAll(this.D);
        if (i11 == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 == null || privacyRules3.size() == 0) {
                this.F = 0;
            } else {
                int i19 = 0;
                while (true) {
                    if (i19 >= privacyRules3.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i19);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.F = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.F = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.F = 1;
                            break;
                        }
                        i19++;
                    }
                }
            }
            this.h = this.F;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            boolean z18 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.w0 = z18;
            this.x0 = z18;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            boolean z19 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.y0 = z19;
            this.z0 = z19;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.B0 = true;
                this.A0 = true;
                this.D0 = true;
                this.C0 = true;
                this.F0 = true;
                this.E0 = true;
                this.H0 = true;
                this.G0 = true;
                this.J0 = true;
                this.I0 = true;
            } else {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.B0 = z20;
                this.A0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.D0 = z21;
                this.C0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.F0 = z22;
                this.E0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.H0 = z23;
                this.G0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.J0 = z24;
                this.I0 = z24;
            }
        }
        E0(false);
        AndroidUtilities.updateVisibleRows(this.d);
    }

    public final void w0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.b.a(0.0f);
        int i9 = this.x;
        if ((i9 == 10 || i9 == 1 || i9 == 2) && this.E != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = iArr[i10];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i11);
                if (i11 != i9 && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.resourceProvider);
                    alertDialog$Builder.a.N = LocaleController.getString(i11 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle);
                    alertDialog$Builder.a.P = LocaleController.getString(i11 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new bg.x2(this, i11, 15));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mw0(this, 1));
                    alertDialog$Builder.o();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean x0() {
        ArrayList arrayList;
        int i9 = this.x;
        if (i9 == 0 && ((this.E != 0 || ((arrayList = this.D) != null && !arrayList.isEmpty())) && this.w0 != this.x0)) {
            return true;
        }
        if (i9 == 12 && (this.y0 != this.z0 || this.C0 != this.D0 || this.A0 != this.B0 || this.E0 != this.F0 || this.G0 != this.H0 || this.I0 != this.J0)) {
            return true;
        }
        int i10 = this.f;
        int i11 = this.E;
        if (i10 != i11) {
            return true;
        }
        if (i9 == 6 && i11 == 1 && this.h != this.F) {
            return true;
        }
        if (i11 != 0) {
            if (this.s[i11 == 2 ? (char) 0 : (char) 1] != this.y[i11 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i9 == 10 && i11 == 3 && this.H != this.G) || this.v[i11] != this.A[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.r;
        if (arrayList2.size() != this.D.size()) {
            return true;
        }
        ArrayList arrayList3 = this.n;
        if (arrayList3.size() != this.C.size()) {
            return true;
        }
        if (i9 != 10 || this.E == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.C);
            if (!arrayList3.equals(this.C)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.D);
            if (!arrayList2.equals(this.D)) {
                return true;
            }
        }
        return false;
    }

    public final void y0() {
        if (getParentActivity() == null) {
            return;
        }
        int i9 = this.x;
        if (i9 == 10 && this.E == 3 && !getUserConfig().isPremium()) {
            showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) this, 27, true));
            return;
        }
        if (this.E != 0 && i9 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i9 == 1) {
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(12, this, globalMainSettings));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder.a);
                return;
            }
        }
        s0();
    }

    public final void z0() {
        vw0 vw0Var = this.e;
        if (vw0Var != null) {
            vw0Var.f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i9 = this.E;
            if (i9 == 0) {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.e.f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i9 == 1) {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.e.f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.e.f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.e.b.t2();
        }
    }

    public PrivacyControlActivity(int i9) {
        this(i9, false);
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void D(float f10) {
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
    }
}
