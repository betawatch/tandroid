package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class hy0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int u0 = 0;
    public View E;
    public w9 F;
    public TextView G;
    public k H;
    public final AnimatorSet[] I;
    public final View[] J;
    public bi.ld K;
    public final org.telegram.ui.ActionBar.p2 L;
    public ai.q M;
    public final Activity N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public TLRPC.TL_messages_stickerSet S;
    public TLRPC.Document T;
    public SendMessagesHelper.ImportingSticker U;
    public TLRPC.InputStickerSet V;
    public ArrayList W;
    public final ArrayList X;
    public ArrayList Y;
    public HashMap Z;
    public final String a0;
    public Pattern b;
    public final ey0 b0;
    public bi.y1 c;
    public fy0 c0;
    public dy0 d;
    public org.telegram.ui.n70 d0;
    public s4.y e;
    public int e0;
    public TLRPC.Document f;
    public int f0;
    public boolean g0;
    public m90 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public final com.google.firebase.messaging.n l0;
    public final wx0 m0;
    public org.telegram.ui.ActionBar.w0 n;
    public sx0 n0;
    public String o0;
    public int p0;
    public boolean q0;
    public org.telegram.ui.ActionBar.g1 r;
    public String r0;
    public o6 s;
    public Runnable s0;
    public ArrayList t0;
    public qg.s0 v;
    public FrameLayout w;
    public FrameLayout x;
    public TextView y;

    public hy0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new wx0(this);
        this.resourcesProvider = f6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.qs0 qs0Var = (org.telegram.ui.qs0) this;
        this.f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new bi.l9(qs0Var, obj, tL_messages_getAttachedStickers, new th(10, qs0Var, tL_messages_getAttachedStickers), 6));
        r0(context);
    }

    public static /* synthetic */ void A(hy0 hy0Var) {
        hy0Var.dismiss();
        fy0 fy0Var = hy0Var.c0;
        if (fy0Var != null) {
            fy0Var.a();
        }
        if (hy0Var.V == null || MediaDataController.getInstance(hy0Var.currentAccount).cancelRemovingStickerSet(hy0Var.V.id)) {
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = hy0Var.V;
        ConnectionsManager.getInstance(hy0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new z1(hy0Var, 13));
    }

    public static void C(hy0 hy0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.p2 p2Var = hy0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy0Var.S;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(hy0Var.currentAccount).linkPrefix + "/addstickers/" + hy0Var.S.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(hy0Var.currentAccount).linkPrefix + "/addemoji/" + hy0Var.S.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = hy0Var.N;
            if (context == null && p2Var != null) {
                context = p2Var.getParentActivity();
            }
            if (context == null) {
                context = hy0Var.getContext();
            }
            ux0 ux0Var = new ux0(hy0Var, context, str2, str2, hy0Var.resourcesProvider);
            if (p2Var == null) {
                ux0Var.show();
                return;
            }
            p2Var.showDialog(ux0Var);
            if (p2Var instanceof org.telegram.ui.eo) {
                ux0Var.setCalcMandatoryInsets(((org.telegram.ui.eo) p2Var).x9());
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                new wc((FrameLayout) hy0Var.containerView, hy0Var.resourcesProvider).k(false).j();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 3) {
            if (hy0Var.R) {
                hy0Var.n0();
                return;
            } else {
                hy0Var.p0();
                return;
            }
        }
        if (i10 == 4) {
            ny0.c(hy0Var.S.set, hy0Var.resourcesProvider, hy0Var.getContext(), new e(hy0Var, 20));
        } else if (i10 == 5) {
            ny0.b(hy0Var.S.set, hy0Var.resourcesProvider, hy0Var.getContext(), new rx0(hy0Var, 2));
        }
    }

    public static void D(hy0 hy0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 p2Var = hy0Var.L;
        TLRPC.StickerSet stickerSet = hy0Var.S.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (hy0Var.j0) {
                    pc.g(p2Var, new lx0(hy0Var.w.getContext(), hy0Var.S, 1, 2, null, hy0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(hy0Var.currentAccount).processStickerSetInstallResultArchive(p2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(hy0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(hy0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void E(hy0 hy0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        hy0Var.f0 = 0;
        if (tL_error != null) {
            hy0Var.dismiss();
            org.telegram.ui.ActionBar.p2 p2Var = hy0Var.L;
            if (p2Var != null) {
                org.telegram.messenger.a2.p(R.string.AddStickersNotFound, wc.a0(p2Var), null);
                return;
            }
            return;
        }
        om0 om0Var = new om0(hy0Var, 1);
        om0Var.addTarget(hy0Var.containerView);
        TransitionManager.beginDelayedTransition(hy0Var.container, om0Var);
        hy0Var.n.setVisibility(0);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        hy0Var.S = tL_messages_stickerSet;
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = hy0Var.S;
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
            hy0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = hy0Var.S;
        if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
            z10 = true;
        }
        hy0Var.h0 = z10;
        hy0Var.l0();
        mediaDataController.preloadStickerSetThumb(hy0Var.S);
        hy0Var.C0();
        hy0Var.B0();
        hy0Var.A0();
        hy0Var.d.l();
    }

    public static /* synthetic */ void F(hy0 hy0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        hy0Var.p0 = ConnectionsManager.getInstance(hy0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new bi.wa(hy0Var, str, textView, 11), 2);
    }

    public static void H(hy0 hy0Var) {
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(hy0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy0Var.S;
        boolean z10 = tL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.id);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = hy0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && hy0Var.r == null) {
            hy0Var.n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            hy0Var.n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                hy0Var.r = hy0Var.n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, hy0Var.getContext(), hy0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, hy0Var.resourcesProvider).setOnClickListener(new px0(hy0Var, 4));
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, hy0Var.resourcesProvider);
                int themedColor = hy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, hy0Var.resourcesProvider).setOnClickListener(new px0(hy0Var, 6));
                c10.setOnClickListener(new px0(hy0Var, 7));
                hy0Var.r = hy0Var.n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            hy0Var.n.a(-1);
            db0 db0Var = new db0(hy0Var.currentAccount, hy0Var.getContext(), hy0Var.resourcesProvider, new ArrayList(), 4);
            db0Var.setOnClickListener(new px0(hy0Var, 8));
            db0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = hy0Var.n;
            w0Var.o();
            w0Var.b.a(db0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = hy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7);
            hy0Var.r.c(themedColor2, themedColor2);
            hy0Var.r.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor2));
            if (hy0Var.r.getRightIcon() != null) {
                hy0Var.r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (hy0Var.n.getPopupLayout() != null) {
            hy0Var.n.getPopupLayout().requestLayout();
        }
        hy0Var.n.M(null, null);
    }

    public static void O(hy0 hy0Var) {
        if (hy0Var.c.getChildCount() <= 0) {
            hy0Var.y0(hy0Var.c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < hy0Var.c.getChildCount(); i12++) {
            View childAt = hy0Var.c.getChildAt(i12);
            hy0Var.c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            hy0Var.v0(0, true);
        } else {
            int top = view.getTop();
            hy0Var.v0(0, false);
            i10 = top;
        }
        hy0Var.v0(1, true);
        if (hy0Var.e0 != i10) {
            hy0Var.y0(i10);
        }
    }

    public static void m(hy0 hy0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof by0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy0Var.S;
            org.telegram.ui.ActionBar.p2 p2Var = hy0Var.L;
            org.telegram.ui.ActionBar.f6 f6Var = hy0Var.resourcesProvider;
            if (p2Var == null) {
                return;
            }
            Context context = p2Var.getContext();
            if (!(p2Var instanceof org.telegram.ui.eo)) {
                ny0.a(tL_messages_stickerSet, p2Var, f6Var);
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, f6Var);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
            org.telegram.ui.Cells.r6.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
            arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
            arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
            arrayList2.add(1);
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            hi.c cVar = new hi.c(p1Var, arrayList2, tL_messages_stickerSet, p2Var, f6Var, 7);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, f6Var);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(cVar);
            }
            p1Var.c = 100;
            p1Var.g = true;
            p1Var.setOutsideTouchable(true);
            p1Var.setClippingEnabled(true);
            p1Var.setAnimationStyle(R.style.PopupContextAnimation);
            p1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            p1Var.setInputMethodMode(2);
            p1Var.getContentView().setFocusableInTouchMode(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            p1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
            p1Var.b();
            return;
        }
        if (hy0Var.R) {
            return;
        }
        if (hy0Var.W != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) hy0Var.d.f.get(i10);
            if (stickerSetCovered != null) {
                hy0Var.dismiss();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.id = stickerSet2.id;
                new hy0(hy0Var.N, hy0Var.L, tL_inputStickerSetID, null, null, hy0Var.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList arrayList4 = hy0Var.Y;
        if (arrayList4 != null) {
            if (i10 < 0 || i10 >= arrayList4.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hy0Var.Y.get(i10);
            hy0Var.U = importingSticker;
            if (importingSticker.validated) {
                TextView textView = hy0Var.G;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                hy0Var.F.m(ImageLocation.getForPath(hy0Var.U.path), null, null, null, null, hy0Var.U.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hy0Var.x.getLayoutParams();
                layoutParams.topMargin = hy0Var.e0;
                hy0Var.x.setLayoutParams(layoutParams);
                hy0Var.x.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(hy0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = hy0Var.S;
        if (tL_messages_stickerSet2 == null || i10 < 0 || i10 >= tL_messages_stickerSet2.documents.size()) {
            return;
        }
        hy0Var.T = hy0Var.S.documents.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= hy0Var.T.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = hy0Var.T.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    TextView textView2 = hy0Var.G;
                    textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                }
            } else {
                i12++;
            }
        }
        hy0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(hy0Var.currentAccount).getEmojiForSticker(hy0Var.T.id), hy0Var.G.getPaint().getFontMetricsInt(), false));
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = hy0Var.S;
        if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.tt.q().y(view)) {
            hy0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(hy0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(hy0Var.T.thumbs, 90), hy0Var.T), (String) null, "webp", hy0Var.S, 1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) hy0Var.x.getLayoutParams();
            layoutParams2.topMargin = hy0Var.e0;
            hy0Var.x.setLayoutParams(layoutParams2);
            hy0Var.x.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hy0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static /* synthetic */ void n(hy0 hy0Var) {
        hy0Var.n.n();
        ny0.b(hy0Var.S.set, hy0Var.resourcesProvider, hy0Var.getContext(), new rx0(hy0Var, 4));
    }

    public static /* synthetic */ void o(org.telegram.ui.qs0 qs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        qs0Var.f0 = 0;
        if (tL_error != null || !(tLObject instanceof Vector)) {
            d5.f0(qs0Var.currentAccount, tL_error, qs0Var.L, tL_messages_getAttachedStickers, new Object[0]);
            qs0Var.dismiss();
            return;
        }
        Vector vector = (Vector) tLObject;
        if (vector.objects.isEmpty()) {
            qs0Var.dismiss();
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            qs0Var.V = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            qs0Var.t0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        qs0Var.W = arrayList;
        arrayList.addAll(vector.objects);
        qs0Var.c.setLayoutParams(w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        qs0Var.h.setVisibility(8);
        qs0Var.J[0].setVisibility(8);
        qs0Var.d.l();
    }

    public static void o0(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (p2Var == null) {
            return;
        }
        org.telegram.ui.eo eoVar = p2Var instanceof org.telegram.ui.eo ? (org.telegram.ui.eo) p2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new bi.e2((Object) p2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) eoVar, z10, 18), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gg.v0(pathToAttach, arrayList, p2Var, eoVar, document, z10, tL_messages_stickerSet), 300L);
    }

    public static /* synthetic */ void p(org.telegram.ui.qs0 qs0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, th thVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            thVar.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(qs0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, thVar);
        }
    }

    public static /* synthetic */ void q(hy0 hy0Var) {
        hy0Var.dismiss();
        MediaDataController.getInstance(hy0Var.currentAccount).toggleStickerSet(hy0Var.getContext(), hy0Var.S, 0, hy0Var.L, true, hy0Var.j0);
    }

    public static /* synthetic */ void r(hy0 hy0Var) {
        hy0Var.n.n();
        hy0Var.dismiss();
        MediaDataController.getInstance(hy0Var.currentAccount).toggleStickerSet(hy0Var.getContext(), hy0Var.S, 1, hy0Var.L, true, true);
    }

    public static /* synthetic */ void s(hy0 hy0Var) {
        hy0Var.dismiss();
        MediaDataController.getInstance(hy0Var.currentAccount).toggleStickerSet(hy0Var.getContext(), hy0Var.S, 1, hy0Var.L, false, false);
    }

    public static /* synthetic */ void t(hy0 hy0Var) {
        hy0Var.dismiss();
        MediaDataController.getInstance(hy0Var.currentAccount).toggleStickerSet(hy0Var.getContext(), hy0Var.S, 1, hy0Var.L, false, false);
    }

    public static /* synthetic */ boolean v(hy0 hy0Var, MotionEvent motionEvent) {
        if (hy0Var.R) {
            return false;
        }
        return org.telegram.ui.tt.q().s(motionEvent, hy0Var.c, hy0Var.H, hy0Var.m0, hy0Var.resourcesProvider);
    }

    public static /* synthetic */ void w(hy0 hy0Var, ArrayList arrayList, Boolean bool) {
        hy0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            hy0Var.dismiss();
            return;
        }
        hy0Var.d.l();
        if (bool.booleanValue()) {
            hy0Var.Z = new HashMap();
            int size = hy0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hy0Var.Y.get(i10);
                hy0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(hy0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        hy0Var.B0();
    }

    public static void x(hy0 hy0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 == 1) {
            return;
        }
        if (i10 == 0) {
            iArr[0] = 1;
            TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
            String obj = editTextBoldCursor.getText().toString();
            hy0Var.r0 = obj;
            tL_stickers_suggestShortName.title = obj;
            ConnectionsManager.getInstance(hy0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new bi.ze(hy0Var, editTextBoldCursor, textView, textView2, iArr));
            return;
        }
        if (i10 == 2) {
            iArr[0] = 3;
            if (!hy0Var.q0) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(hy0Var.currentAccount).prepareImportStickers(hy0Var.r0, hy0Var.o0, hy0Var.a0, hy0Var.Y, new qx0(hy0Var));
            alertDialog$Builder.a.L0.run();
            hy0Var.dismiss();
        }
    }

    public static /* synthetic */ void z(hy0 hy0Var) {
        hy0Var.dismiss();
        MediaDataController.getInstance(hy0Var.currentAccount).toggleStickerSet(hy0Var.getContext(), hy0Var.S, 1, hy0Var.L, true, hy0Var.j0);
    }

    public final void A0() {
        if (this.containerView == null || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        MessageObject.isPremiumEmojiPack(this.S);
    }

    public final void B0() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String formatPluralString;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        int i10 = 1;
        int i11 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.X;
            if (arrayList3 == null) {
                w0(new px0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.j6.n5);
                return;
            }
            m90 m90Var = this.h;
            ArrayList arrayList4 = this.Y;
            m90Var.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.j6.q5);
                this.s.setEnabled(false);
                return;
            }
            px0 px0Var = new px0(this, 13);
            int i12 = R.string.ImportStickers;
            ArrayList arrayList5 = this.Y;
            w0(px0Var, LocaleController.formatString("ImportStickers", i12, LocaleController.formatPluralString("Stickers", arrayList5 != null ? arrayList5.size() : arrayList3.size(), new Object[0])), org.telegram.ui.ActionBar.j6.n5);
            this.s.setEnabled(true);
            return;
        }
        CharSequence replaceEmoji = Emoji.replaceEmoji(this.S.set.title, this.h.getPaint().getFontMetricsInt(), false);
        try {
            if (this.b == null) {
                this.b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
            }
            Matcher matcher = this.b.matcher(replaceEmoji);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                }
                int start = matcher.start();
                int end = matcher.end();
                if (this.S.set.title.charAt(start) != '@') {
                    start++;
                }
                spannableStringBuilder.setSpan(new l4(replaceEmoji.subSequence(start + 1, end).toString(), i10, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                replaceEmoji = spannableStringBuilder;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.h.setText(replaceEmoji);
        int i13 = 5;
        if (s0()) {
            int measuredWidth = this.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d.d = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
        } else {
            this.d.d = 5;
        }
        this.M.y1(this.d.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || UserConfig.getInstance(this.currentAccount).isPremium() || this.d0 != null) {
            this.v.setVisibility(4);
        } else if (this.S.documents != null) {
            for (int i14 = 0; i14 < this.S.documents.size(); i14++) {
                if (!MessageObject.isFreeEmoji(this.S.documents.get(i14))) {
                    this.v.setVisibility(0);
                    this.s.setBackground(null);
                    w0(null, null, -1);
                    this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new px0(this, i11), false);
                    return;
                }
            }
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.S;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z10 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !mediaDataController.isStickerPackInstalled(stickerSet.id);
        } else {
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
            for (int i15 = 0; stickerSets != null && i15 < stickerSets.size(); i15++) {
                if (stickerSets.get(i15) != null && stickerSets.get(i15).set != null && stickerSets.get(i15).set.id == this.S.set.id) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            z10 = !z11;
        }
        org.telegram.ui.n70 n70Var = this.d0;
        if (n70Var != null) {
            px0 px0Var2 = new px0(this, i13);
            boolean z12 = n70Var.a;
            String string = n70Var.c.N ? LocaleController.getString(z12 ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet) : LocaleController.getString(z12 ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
            boolean z13 = this.d0.a;
            x0(px0Var2, string, z13 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.Sh, !z13 ? org.telegram.ui.ActionBar.j6.Oh : -1, z13 ? -1 : org.telegram.ui.ActionBar.j6.Qh);
            return;
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.S;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i10 = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i10 = 0;
            }
            if (!mediaDataController.areStickersLoaded(i10)) {
                mediaDataController.checkStickers(i10);
                x0(null, "", -1, -1, -1);
                return;
            }
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.S;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                formatPluralString = LocaleController.formatPluralString("AddManyMasksCount", arrayList6 == null ? 0 : arrayList6.size(), new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                formatPluralString = LocaleController.formatPluralString("AddManyStickersCount", (tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                formatPluralString = LocaleController.formatPluralString("AddManyEmojiCount", arrayList7 == null ? 0 : arrayList7.size(), new Object[0]);
            }
            x0(new px0(this, 9), formatPluralString, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.Oh, org.telegram.ui.ActionBar.j6.Qh);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.S;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            String string2 = z14 ? LocaleController.getString(this.R ? R.string.Done : R.string.EditStickers) : stickerSet8.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            if (z14) {
                x0(new px0(this, 10), string2, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.Oh, org.telegram.ui.ActionBar.j6.Qh);
            } else {
                String str = string2;
                if (this.S.set.official) {
                    w0(new px0(this, 11), str, org.telegram.ui.ActionBar.j6.q7);
                } else {
                    w0(new px0(this, 12), str, org.telegram.ui.ActionBar.j6.q7);
                }
            }
        }
        this.d.l();
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
            float f7 = min;
            this.F.setLayoutParams(w7.a6.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.a6.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.y.setVisibility(0);
            this.E.setVisibility(0);
            return;
        }
        if (this.b0 == null || ((tL_messages_stickerSet = this.S) != null && tL_messages_stickerSet.set.masks)) {
            this.y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.a6.e(min, min, 17));
            this.G.setLayoutParams(w7.a6.e(min, min, 17));
            this.y.setVisibility(8);
            this.E.setVisibility(8);
            return;
        }
        this.y.setText(LocaleController.getString(R.string.SendSticker));
        float f10 = min;
        this.F.setLayoutParams(w7.a6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.G.setLayoutParams(w7.a6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.y.setVisibility(0);
        this.E.setVisibility(0);
    }

    public final void D0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            C0();
            B0();
            this.d.l();
        }
        A0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        l0();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.y1 y1Var = this.c;
            if (y1Var != null) {
                int childCount = y1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.c.getChildAt(i12).invalidate();
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
            if (importingSticker != null) {
                importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new gf(this, str, importingSticker, 28));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.Z;
            if (hashMap2 == null) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
            if (importingSticker2 != null) {
                u0(importingSticker2);
            }
            if (this.Z.isEmpty()) {
                B0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (this.V != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.V.short_name;
                r5 = str2 != null ? mediaDataController.getStickerSetByName(str2) : null;
                if (r5 == null) {
                    r5 = mediaDataController.getStickerSetById(this.V.id);
                }
            }
            if (r5 != null && r5 != this.S) {
                this.S = r5;
                t0();
            }
            B0();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        super.dismiss();
        this.l0.E(false);
        Runnable runnable = this.s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f0, true);
            this.f0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            ArrayList arrayList = this.Y;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.Y.get(i10);
                    if (!importingSticker.validated) {
                        FileLoader.getInstance(this.currentAccount).cancelFileUpload(importingSticker.path, false);
                    }
                    if (importingSticker.animated) {
                        new File(importingSticker.path).delete();
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        hy0 hy0Var = this.d.r;
        if (hy0Var.W != null) {
            org.telegram.ui.Cells.r3.a(arrayList, hy0Var.c, x6Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.j6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.j6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 32, null, null, null, null, i10));
        o6 o6Var = this.s;
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 4, null, null, null, null, this.k0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.G8));
        return arrayList;
    }

    public final void l0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void m0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.w6));
            this.q0 = true;
            this.o0 = str;
            return;
        }
        sx0 sx0Var = this.n0;
        if (sx0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sx0Var);
            this.n0 = null;
            this.o0 = null;
            if (this.p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q5));
            return;
        }
        this.q0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
        } else {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.F6));
            this.o0 = str;
            sx0 sx0Var2 = new sx0(this, str, textView, 1);
            this.n0 = sx0Var2;
            AndroidUtilities.runOnUIThread(sx0Var2, 300L);
        }
    }

    public final void n0() {
        if (this.R) {
            this.e.d(null);
            this.R = false;
            this.l0.E(true);
            AndroidUtilities.forEachViews((RecyclerView) this.c, (e2.h) new gg.g0(22));
            this.n.postDelayed(new rx0(this, 0), 200L);
            this.s.c(LocaleController.getString(R.string.EditStickers), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.tt.q().E) {
            org.telegram.ui.tt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        pc.a((FrameLayout) this.containerView, new bi.rd(this, 5));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        pc.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.R) {
            return;
        }
        this.e.d(this.c);
        int i10 = 1;
        this.R = true;
        com.google.firebase.messaging.n nVar = this.l0;
        nVar.E(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) nVar.d;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < 6; i11++) {
                arrayList.add(valueOf);
                ((ArrayList) nVar.e).add(valueOf);
                ((ArrayList) nVar.f).add(valueOf);
            }
        }
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            long nextFloat = (long) (Utilities.random.nextFloat() * 300);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new gy0(nVar, i12, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new gy0(nVar, i12, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new gy0(nVar, i12, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) nVar.a).add(ofFloat);
            ((ArrayList) nVar.b).add(ofFloat2);
            ((ArrayList) nVar.c).add(ofFloat3);
            i12++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.c, (e2.h) new gg.g0(23));
        this.n.postDelayed(new rx0(this, i10), 200L);
        this.s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new zn0(this, 7));
        animatorSet.start();
    }

    public final void r0(Context context) {
        zx0 zx0Var = new zx0(this, context);
        this.containerView = zx0Var;
        zx0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.j6.V5;
        view.setBackgroundColor(getThemedColor(i11));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        bi.y1 y1Var = new bi.y1(this, context, 22);
        this.c = y1Var;
        y1Var.setTag(14);
        bi.y1 y1Var2 = this.c;
        getContext();
        ai.q qVar = new ai.q(this);
        this.M = qVar;
        y1Var2.setLayoutManager(qVar);
        this.M.O = new bi.i2(this, 5);
        this.e = new s4.y(new ay0(this));
        bi.y1 y1Var3 = this.c;
        dy0 dy0Var = new dy0(this, context);
        this.d = dy0Var;
        y1Var3.setAdapter(dy0Var);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.i(new fg.j0(7));
        this.c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.c.setClipToPadding(false);
        this.c.setEnabled(true);
        this.c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        int i12 = 4;
        this.c.setOnTouchListener(new bs(this, i12));
        this.c.setOnScrollListener(new al0(this, i12));
        k kVar = new k(this, 16);
        this.H = kVar;
        this.c.setOnItemClickListener(kVar);
        this.containerView.addView(this.c, w7.a6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.ld ldVar = new bi.ld(this, context, 18);
        this.K = ldVar;
        this.containerView.addView(ldVar, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.c.setEmptyView(this.K);
        this.K.setOnTouchListener(new ai.h(24));
        m90 m90Var = new m90(context, null);
        this.h = m90Var;
        m90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.a6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.j6.Ji), false, this.resourcesProvider);
        this.n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.n.setSubMenuOpenSide(2);
        this.n.setIcon(R.drawable.ic_ab_other);
        this.n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
        this.containerView.addView(this.n, w7.a6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.n.setOnClickListener(new px0(this, 1));
        this.n.setDelegate(new qx0(this));
        this.n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.n.setVisibility(this.V != null ? 0 : 8);
        this.K.addView(new RadialProgressView(context, null), w7.a6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(viewArr[1], layoutParams2);
        o6 o6Var = new o6(context, false, false, false);
        this.s = o6Var;
        int i13 = org.telegram.ui.ActionBar.j6.h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        o6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(themedColor, getThemedColor(i14)));
        o6 o6Var2 = this.s;
        int i15 = org.telegram.ui.ActionBar.j6.n5;
        this.k0 = i15;
        o6Var2.setTextColor(getThemedColor(i15));
        this.s.setTextSize(AndroidUtilities.dp(14.0f));
        this.s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.addView(this.s, w7.a6.c(48.0f, -1));
        this.containerView.addView(this.w, w7.a6.e(-1, -2, 83));
        qg.s0 s0Var = new qg.s0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = s0Var;
        s0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.a6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.x, w7.a6.c(-1.0f, -1));
        this.x.setOnClickListener(new px0(this, 2));
        w9 w9Var = new w9(context);
        this.F = w9Var;
        w9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.y.setTextColor(getThemedColor(i15));
        this.y.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i13), getThemedColor(i14)));
        this.y.setGravity(17);
        this.y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.y.setTypeface(AndroidUtilities.bold());
        this.x.addView(this.y, w7.a6.e(-1, 48, 83));
        this.y.setOnClickListener(new px0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i11));
        this.x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        B0();
        C0();
        A0();
        z0(false);
        this.d.l();
    }

    public final boolean s0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.Q;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
        this.s0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0() {
        String str;
        if (this.V != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.S == null && (str = this.V.short_name) != null) {
                this.S = mediaDataController.getStickerSetByName(str);
            }
            if (this.S == null) {
                this.S = mediaDataController.getStickerSetById(this.V.id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new th(9, this, mediaDataController));
            } else {
                if (this.d != null) {
                    C0();
                    B0();
                    this.d.l();
                }
                A0();
                mediaDataController.preloadStickerSetThumb(this.S);
                l0();
            }
        }
        if (this.S != null) {
            this.h0 = !r0.set.masks;
        }
        l0();
    }

    public final void u0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                B0();
            }
        }
    }

    public final void v0(int i10, boolean z10) {
        if (this.W != null) {
            return;
        }
        View[] viewArr = this.J;
        if ((!z10 || viewArr[i10].getTag() == null) && (z10 || viewArr[i10].getTag() != null)) {
            return;
        }
        int i11 = 1;
        viewArr[i10].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[i10].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.I;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i10], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new ja0(this, i10, z10, i11));
        animatorSetArr[i10].start();
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            o6 o6Var = this.s;
            this.k0 = i10;
            o6Var.setTextColor(getThemedColor(i10));
        }
        this.s.c(str, false, true);
        this.s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.s.setAlpha(0.0f);
        } else if (i11 < 0 || i12 < 0) {
            this.s.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(org.telegram.ui.ActionBar.j6.h5), org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.q7))));
            this.w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp;
            marginLayoutParams3.bottomMargin = dp;
            marginLayoutParams4.bottomMargin = dp;
            if (this.s.getAlpha() < 1.0f) {
                org.telegram.messenger.em.q(this.s.animate().alpha(1.0f), wr.h, 240L);
            }
        } else {
            o6 o6Var2 = this.s;
            int dp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            o6Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
            this.w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            int dp3 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp3;
            marginLayoutParams.rightMargin = dp3;
            marginLayoutParams.topMargin = dp3;
            marginLayoutParams.leftMargin = dp3;
            int dp4 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.s.getAlpha() < 1.0f) {
                org.telegram.messenger.em.q(this.s.animate().alpha(1.0f), wr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z10) {
        hy0 hy0Var = this.d.r;
        if (hy0Var.W != null) {
            int childCount = hy0Var.c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = hy0Var.c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.l5));
        this.x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5) & (-536870913));
        this.n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
        this.n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        this.n.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        if (this.r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.q7);
            this.r.c(themedColor, themedColor);
            this.r.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
            if (this.r.getRightIcon() != null) {
                this.r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.j6.sl != null && this.t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.l6) this.t0.get(i11)).h = null;
                }
            }
            int size2 = this.t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.t0.get(i12);
                l6Var.d(getThemedColor(l6Var.f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.j6.sl == null && this.t0 != null) {
            this.t0 = null;
        }
    }

    public hy0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new wx0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.a0 = str;
        Utilities.globalQueue.postRunnable(new sx0(this, arrayList, arrayList2, 2));
        r0(context);
    }

    public hy0(Context context, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ey0 ey0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new wx0(this);
        fixNavigationBar();
        this.b0 = ey0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = p2Var;
        t0();
        r0(context);
    }
}
