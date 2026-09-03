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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class xx0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int r0 = 0;
    public View B;
    public p9 C;
    public TextView D;
    public k E;
    public final AnimatorSet[] F;
    public final View[] G;
    public eg.s2 H;
    public final org.telegram.ui.ActionBar.p2 I;
    public zi J;
    public final Activity K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public TLRPC.TL_messages_stickerSet P;
    public TLRPC.Document Q;
    public SendMessagesHelper.ImportingSticker R;
    public TLRPC.InputStickerSet S;
    public ArrayList T;
    public final ArrayList U;
    public ArrayList V;
    public HashMap W;
    public final String X;
    public final ux0 Y;
    public vx0 Z;
    public org.telegram.ui.i70 a0;
    public Pattern b;
    public int b0;
    public mh.d1 c;
    public int c0;
    public tx0 d;
    public boolean d0;
    public f2.f0 e;
    public boolean e0;
    public TLRPC.Document f;
    public boolean f0;
    public boolean g0;
    public g90 h;
    public int h0;
    public final a9.a i0;
    public final lx0 j0;
    public jp k0;
    public String l0;
    public int m0;
    public org.telegram.ui.ActionBar.w0 n;
    public boolean n0;
    public String o0;
    public Runnable p0;
    public ArrayList q0;
    public org.telegram.ui.ActionBar.g1 r;
    public k6 s;
    public fg.b1 v;
    public FrameLayout w;
    public FrameLayout x;
    public TextView y;

    public xx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.g0 = true;
        this.i0 = new a9.a(10);
        this.j0 = new lx0(this);
        this.resourcesProvider = g6Var;
        fixNavigationBar();
        this.K = (Activity) context;
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
        org.telegram.ui.cs0 cs0Var = (org.telegram.ui.cs0) this;
        this.c0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new lh.b1(cs0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.lo(15, cs0Var, tL_messages_getAttachedStickers), 10));
        r0(context);
    }

    public static /* synthetic */ void A(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, true, xx0Var.g0);
    }

    public static /* synthetic */ void B(xx0 xx0Var) {
        xx0Var.dismiss();
        vx0 vx0Var = xx0Var.Z;
        if (vx0Var != null) {
            vx0Var.a();
        }
        if (xx0Var.S == null || MediaDataController.getInstance(xx0Var.currentAccount).cancelRemovingStickerSet(xx0Var.S.id)) {
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = xx0Var.S;
        ConnectionsManager.getInstance(xx0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(xx0Var, 13));
    }

    public static void C(xx0 xx0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(xx0Var.currentAccount).linkPrefix + "/addstickers/" + xx0Var.P.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(xx0Var.currentAccount).linkPrefix + "/addemoji/" + xx0Var.P.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = xx0Var.K;
            if (context == null && p2Var != null) {
                context = p2Var.getParentActivity();
            }
            if (context == null) {
                context = xx0Var.getContext();
            }
            jx0 jx0Var = new jx0(xx0Var, context, str2, str2, xx0Var.resourcesProvider);
            if (p2Var == null) {
                jx0Var.show();
                return;
            }
            p2Var.showDialog(jx0Var);
            if (p2Var instanceof org.telegram.ui.xn) {
                jx0Var.setCalcMandatoryInsets(((org.telegram.ui.xn) p2Var).x9());
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                new qc((FrameLayout) xx0Var.containerView, xx0Var.resourcesProvider).k(false).j();
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        if (i10 == 3) {
            if (xx0Var.O) {
                xx0Var.n0();
                return;
            } else {
                xx0Var.p0();
                return;
            }
        }
        if (i10 == 4) {
            dy0.c(xx0Var.P.set, xx0Var.resourcesProvider, xx0Var.getContext(), new d(xx0Var, 20));
        } else if (i10 == 5) {
            dy0.b(xx0Var.P.set, xx0Var.resourcesProvider, xx0Var.getContext(), new ix0(xx0Var, 2));
        }
    }

    public static void D(xx0 xx0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
        TLRPC.StickerSet stickerSet = xx0Var.P.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (xx0Var.g0) {
                    ic.g(p2Var, new bx0(xx0Var.w.getContext(), xx0Var.P, 1, 2, null, xx0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(xx0Var.currentAccount).processStickerSetInstallResultArchive(p2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(xx0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        MediaDataController.getInstance(xx0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void E(xx0 xx0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z4 = false;
        xx0Var.c0 = 0;
        if (tL_error != null) {
            xx0Var.dismiss();
            org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
            if (p2Var != null) {
                org.telegram.messenger.y3.s(R.string.AddStickersNotFound, qc.a0(p2Var), null);
                return;
            }
            return;
        }
        mm0 mm0Var = new mm0(xx0Var, 1);
        mm0Var.addTarget(xx0Var.containerView);
        TransitionManager.beginDelayedTransition(xx0Var.container, mm0Var);
        xx0Var.n.setVisibility(0);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        xx0Var.P = tL_messages_stickerSet;
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
            xx0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xx0Var.P;
        if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
            z4 = true;
        }
        xx0Var.e0 = z4;
        xx0Var.l0();
        mediaDataController.preloadStickerSetThumb(xx0Var.P);
        xx0Var.C0();
        xx0Var.B0();
        xx0Var.A0();
        xx0Var.d.l();
    }

    public static /* synthetic */ void F(xx0 xx0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        xx0Var.m0 = ConnectionsManager.getInstance(xx0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new hg.y(xx0Var, str, textView, 17), 2);
    }

    public static void G(xx0 xx0Var) {
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(xx0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
        boolean z4 = tL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.id);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && xx0Var.r == null) {
            xx0Var.n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            xx0Var.n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z4) {
                xx0Var.r = xx0Var.n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, xx0Var.getContext(), xx0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, xx0Var.resourcesProvider).setOnClickListener(new gx0(xx0Var, 4));
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, xx0Var.resourcesProvider);
                int themedColor = xx0Var.getThemedColor(org.telegram.ui.ActionBar.k6.q7);
                c3.c(themedColor, themedColor);
                c3.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, xx0Var.resourcesProvider).setOnClickListener(new gx0(xx0Var, 6));
                c3.setOnClickListener(new gx0(xx0Var, 7));
                xx0Var.r = xx0Var.n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            xx0Var.n.a(-1);
            xa0 xa0Var = new xa0(xx0Var.currentAccount, xx0Var.getContext(), xx0Var.resourcesProvider, new ArrayList(), 4);
            xa0Var.setOnClickListener(new gx0(xx0Var, 8));
            xa0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = xx0Var.n;
            w0Var.o();
            w0Var.b.a(xa0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = xx0Var.getThemedColor(org.telegram.ui.ActionBar.k6.q7);
            xx0Var.r.c(themedColor2, themedColor2);
            xx0Var.r.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, themedColor2));
            if (xx0Var.r.getRightIcon() != null) {
                xx0Var.r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (xx0Var.n.getPopupLayout() != null) {
            xx0Var.n.getPopupLayout().requestLayout();
        }
        xx0Var.n.M(null, null);
    }

    public static void O(xx0 xx0Var) {
        if (xx0Var.c.getChildCount() <= 0) {
            xx0Var.y0(xx0Var.c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < xx0Var.c.getChildCount(); i12++) {
            View childAt = xx0Var.c.getChildAt(i12);
            xx0Var.c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            xx0Var.v0(0, true);
        } else {
            int top = view.getTop();
            xx0Var.v0(0, false);
            i10 = top;
        }
        xx0Var.v0(1, true);
        if (xx0Var.b0 != i10) {
            xx0Var.y0(i10);
        }
    }

    public static void m(xx0 xx0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof qx0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
            org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
            org.telegram.ui.ActionBar.g6 g6Var = xx0Var.resourcesProvider;
            if (p2Var == null) {
                return;
            }
            Context context = p2Var.getContext();
            if (!(p2Var instanceof org.telegram.ui.xn)) {
                dy0.a(tL_messages_stickerSet, p2Var, g6Var);
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, g6Var);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
            org.telegram.ui.b.h(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
            arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
            arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
            arrayList2.add(1);
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            oh.b0 b0Var = new oh.b0(p1Var, arrayList2, tL_messages_stickerSet, p2Var, g6Var, 10);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, g6Var);
                c3.setTag(Integer.valueOf(i11));
                c3.setOnClickListener(b0Var);
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
        if (xx0Var.O) {
            return;
        }
        if (xx0Var.T != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xx0Var.d.f.get(i10);
            if (stickerSetCovered != null) {
                xx0Var.dismiss();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.id = stickerSet2.id;
                new xx0(xx0Var.K, xx0Var.I, tL_inputStickerSetID, null, null, xx0Var.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList arrayList4 = xx0Var.V;
        if (arrayList4 != null) {
            if (i10 < 0 || i10 >= arrayList4.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10);
            xx0Var.R = importingSticker;
            if (importingSticker.validated) {
                TextView textView = xx0Var.D;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                xx0Var.C.m(ImageLocation.getForPath(xx0Var.R.path), null, null, null, null, xx0Var.R.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xx0Var.x.getLayoutParams();
                layoutParams.topMargin = xx0Var.b0;
                xx0Var.x.setLayoutParams(layoutParams);
                xx0Var.x.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(xx0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
        if (tL_messages_stickerSet2 == null || i10 < 0 || i10 >= tL_messages_stickerSet2.documents.size()) {
            return;
        }
        xx0Var.Q = xx0Var.P.documents.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= xx0Var.Q.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = xx0Var.Q.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    TextView textView2 = xx0Var.D;
                    textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                }
            } else {
                i12++;
            }
        }
        xx0Var.D.setText(Emoji.replaceEmoji(MediaDataController.getInstance(xx0Var.currentAccount).getEmojiForSticker(xx0Var.Q.id), xx0Var.D.getPaint().getFontMetricsInt(), false));
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xx0Var.P;
        if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.qt.q().y(view)) {
            xx0Var.C.getImageReceiver().setImage(ImageLocation.getForDocument(xx0Var.Q), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(xx0Var.Q.thumbs, 90), xx0Var.Q), (String) null, "webp", xx0Var.P, 1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xx0Var.x.getLayoutParams();
            layoutParams2.topMargin = xx0Var.b0;
            xx0Var.x.setLayoutParams(layoutParams2);
            xx0Var.x.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xx0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static /* synthetic */ void n(xx0 xx0Var) {
        xx0Var.n.n();
        dy0.b(xx0Var.P.set, xx0Var.resourcesProvider, xx0Var.getContext(), new ix0(xx0Var, 4));
    }

    public static /* synthetic */ void o(org.telegram.ui.cs0 cs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        cs0Var.c0 = 0;
        if (tL_error != null || !(tLObject instanceof Vector)) {
            z4.f0(cs0Var.currentAccount, tL_error, cs0Var.I, tL_messages_getAttachedStickers, new Object[0]);
            cs0Var.dismiss();
            return;
        }
        Vector vector = (Vector) tLObject;
        if (vector.objects.isEmpty()) {
            cs0Var.dismiss();
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            cs0Var.S = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            cs0Var.t0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        cs0Var.T = arrayList;
        arrayList.addAll(vector.objects);
        cs0Var.c.setLayoutParams(k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        cs0Var.h.setVisibility(8);
        cs0Var.G[0].setVisibility(8);
        cs0Var.d.l();
    }

    public static void o0(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (p2Var == null) {
            return;
        }
        org.telegram.ui.xn xnVar = p2Var instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var : null;
        boolean z4 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new hg.j(p2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) xnVar, z4, 15), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new kh.h(pathToAttach, arrayList, p2Var, xnVar, document, z4, tL_messages_stickerSet), 300L);
    }

    public static /* synthetic */ void p(org.telegram.ui.cs0 cs0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.lo loVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            loVar.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(cs0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, loVar);
        }
    }

    public static /* synthetic */ void q(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 0, xx0Var.I, true, xx0Var.g0);
    }

    public static /* synthetic */ void r(xx0 xx0Var) {
        xx0Var.n.n();
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, true, true);
    }

    public static /* synthetic */ void s(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, false, false);
    }

    public static /* synthetic */ void t(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, false, false);
    }

    public static /* synthetic */ boolean v(xx0 xx0Var, MotionEvent motionEvent) {
        if (xx0Var.O) {
            return false;
        }
        return org.telegram.ui.qt.q().s(motionEvent, xx0Var.c, xx0Var.E, xx0Var.j0, xx0Var.resourcesProvider);
    }

    public static /* synthetic */ void w(xx0 xx0Var, ArrayList arrayList, Boolean bool) {
        xx0Var.V = arrayList;
        if (arrayList.isEmpty()) {
            xx0Var.dismiss();
            return;
        }
        xx0Var.d.l();
        if (bool.booleanValue()) {
            xx0Var.W = new HashMap();
            int size = xx0Var.V.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10);
                xx0Var.W.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(xx0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        xx0Var.B0();
    }

    public static void x(xx0 xx0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 == 1) {
            return;
        }
        if (i10 == 0) {
            iArr[0] = 1;
            TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
            String obj = editTextBoldCursor.getText().toString();
            xx0Var.o0 = obj;
            tL_stickers_suggestShortName.title = obj;
            ConnectionsManager.getInstance(xx0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new hg.e0(xx0Var, editTextBoldCursor, textView, textView2, iArr, 8));
            return;
        }
        if (i10 == 2) {
            iArr[0] = 3;
            if (!xx0Var.n0) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(xx0Var.currentAccount).prepareImportStickers(xx0Var.o0, xx0Var.l0, xx0Var.X, xx0Var.V, new hx0(xx0Var));
            alertDialog$Builder.a.I0.run();
            xx0Var.dismiss();
        }
    }

    public final void A0() {
        if (this.containerView == null || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        MessageObject.isPremiumEmojiPack(this.P);
    }

    public final void B0() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z4;
        TLRPC.StickerSet stickerSet;
        String formatPluralString;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        TLRPC.StickerSet stickerSet6;
        boolean z10;
        TLRPC.StickerSet stickerSet7;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.P;
        int i10 = 1;
        int i11 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.U;
            if (arrayList3 == null) {
                w0(new gx0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.k6.n5);
                return;
            }
            g90 g90Var = this.h;
            ArrayList arrayList4 = this.V;
            g90Var.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
            HashMap hashMap = this.W;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.k6.q5);
                this.s.setEnabled(false);
                return;
            }
            gx0 gx0Var = new gx0(this, 13);
            int i12 = R.string.ImportStickers;
            ArrayList arrayList5 = this.V;
            w0(gx0Var, LocaleController.formatString("ImportStickers", i12, LocaleController.formatPluralString("Stickers", arrayList5 != null ? arrayList5.size() : arrayList3.size(), new Object[0])), org.telegram.ui.ActionBar.k6.n5);
            this.s.setEnabled(true);
            return;
        }
        CharSequence replaceEmoji = Emoji.replaceEmoji(this.P.set.title, this.h.getPaint().getFontMetricsInt(), false);
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
                if (this.P.set.title.charAt(start) != '@') {
                    start++;
                }
                spannableStringBuilder.setSpan(new h4(replaceEmoji.subSequence(start + 1, end).toString(), i10, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                replaceEmoji = spannableStringBuilder;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
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
        this.J.y1(this.d.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.P;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || UserConfig.getInstance(this.currentAccount).isPremium() || this.a0 != null) {
            this.v.setVisibility(4);
        } else if (this.P.documents != null) {
            for (int i14 = 0; i14 < this.P.documents.size(); i14++) {
                if (!MessageObject.isFreeEmoji(this.P.documents.get(i14))) {
                    this.v.setVisibility(0);
                    this.s.setBackground(null);
                    w0(null, null, -1);
                    this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new gx0(this, i11), false);
                    return;
                }
            }
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.P;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z4 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !mediaDataController.isStickerPackInstalled(stickerSet.id);
        } else {
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
            for (int i15 = 0; stickerSets != null && i15 < stickerSets.size(); i15++) {
                if (stickerSets.get(i15) != null && stickerSets.get(i15).set != null && stickerSets.get(i15).set.id == this.P.set.id) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            z4 = !z10;
        }
        org.telegram.ui.i70 i70Var = this.a0;
        if (i70Var != null) {
            gx0 gx0Var2 = new gx0(this, i13);
            boolean z11 = i70Var.a;
            String string = i70Var.c.K ? LocaleController.getString(z11 ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet) : LocaleController.getString(z11 ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
            boolean z12 = this.a0.a;
            x0(gx0Var2, string, z12 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.Sh, !z12 ? org.telegram.ui.ActionBar.k6.Oh : -1, z12 ? -1 : org.telegram.ui.ActionBar.k6.Qh);
            return;
        }
        if (z4) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.P;
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
        if (z4) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.P;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                formatPluralString = LocaleController.formatPluralString("AddManyMasksCount", arrayList6 == null ? 0 : arrayList6.size(), new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                formatPluralString = LocaleController.formatPluralString("AddManyStickersCount", (tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                formatPluralString = LocaleController.formatPluralString("AddManyEmojiCount", arrayList7 == null ? 0 : arrayList7.size(), new Object[0]);
            }
            x0(new gx0(this, 9), formatPluralString, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.P;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z13 = stickerSet8.creator;
            String string2 = z13 ? LocaleController.getString(this.O ? R.string.Done : R.string.EditStickers) : stickerSet8.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            if (z13) {
                x0(new gx0(this, 10), string2, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
            } else {
                String str = string2;
                if (this.P.set.official) {
                    w0(new gx0(this, 11), str, org.telegram.ui.ActionBar.k6.q7);
                } else {
                    w0(new gx0(this, 12), str, org.telegram.ui.ActionBar.k6.q7);
                }
            }
        }
        this.d.l();
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.U != null) {
            this.y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.q7));
            float f10 = min;
            this.C.setLayoutParams(k7.c6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.D.setLayoutParams(k7.c6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.y.setVisibility(0);
            this.B.setVisibility(0);
            return;
        }
        if (this.Y == null || ((tL_messages_stickerSet = this.P) != null && tL_messages_stickerSet.set.masks)) {
            this.y.setText(LocaleController.getString(R.string.Close));
            this.C.setLayoutParams(k7.c6.e(min, min, 17));
            this.D.setLayoutParams(k7.c6.e(min, min, 17));
            this.y.setVisibility(8);
            this.B.setVisibility(8);
            return;
        }
        this.y.setText(LocaleController.getString(R.string.SendSticker));
        float f11 = min;
        this.C.setLayoutParams(k7.c6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.D.setLayoutParams(k7.c6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.y.setVisibility(0);
        this.B.setVisibility(0);
    }

    public final void D0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.P = tL_messages_stickerSet;
        if (this.d != null) {
            C0();
            B0();
            this.d.l();
        }
        A0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.P);
        l0();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mh.d1 d1Var = this.c;
            if (d1Var != null) {
                int childCount = d1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.c.getChildAt(i12).invalidate();
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.W;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
            if (importingSticker != null) {
                importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new jp(this, str, importingSticker, 23));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.W;
            if (hashMap2 == null) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
            if (importingSticker2 != null) {
                u0(importingSticker2);
            }
            if (this.W.isEmpty()) {
                B0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (this.S != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.S.short_name;
                r5 = str2 != null ? mediaDataController.getStickerSetByName(str2) : null;
                if (r5 == null) {
                    r5 = mediaDataController.getStickerSetById(this.S.id);
                }
            }
            if (r5 != null && r5 != this.P) {
                this.P = r5;
                t0();
            }
            B0();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        super.dismiss();
        this.i0.C(false);
        Runnable runnable = this.p0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.c0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.c0, true);
            this.c0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.U != null) {
            ArrayList arrayList = this.V;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.V.get(i10);
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
        t6 t6Var = new t6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        xx0 xx0Var = this.d.r;
        if (xx0Var.T != null) {
            org.telegram.ui.Cells.r3.a(arrayList, xx0Var.c, t6Var);
        }
        View[] viewArr = this.G;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.k6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.k6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 32, null, null, null, null, i10));
        k6 k6Var = this.s;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(k6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.s, 4, null, null, null, null, this.h0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.G8));
        return arrayList;
    }

    public final void l0() {
        if (this.P != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.P);
            this.P = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void m0(TextView textView, String str, boolean z4) {
        if (z4) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.w6));
            this.n0 = true;
            this.l0 = str;
            return;
        }
        jp jpVar = this.k0;
        if (jpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jpVar);
            this.k0 = null;
            this.l0 = null;
            if (this.m0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.m0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.q5));
            return;
        }
        this.n0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.p7));
        } else {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.F6));
            this.l0 = str;
            jp jpVar2 = new jp(this, str, textView, 26);
            this.k0 = jpVar2;
            AndroidUtilities.runOnUIThread(jpVar2, 300L);
        }
    }

    public final void n0() {
        if (this.O) {
            this.e.d(null);
            this.O = false;
            this.i0.C(true);
            AndroidUtilities.forEachViews((RecyclerView) this.c, (h5.d) new ag.d(11));
            this.n.postDelayed(new ix0(this, 0), 200L);
            this.s.c(LocaleController.getString(R.string.EditStickers), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.qt.q().E) {
            org.telegram.ui.qt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ic.a((FrameLayout) this.containerView, new lh.t0(this, 9));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ic.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.O) {
            return;
        }
        this.e.d(this.c);
        int i10 = 1;
        this.O = true;
        a9.a aVar = this.i0;
        aVar.C(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) aVar.d;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < 6; i11++) {
                arrayList.add(valueOf);
                ((ArrayList) aVar.e).add(valueOf);
                ((ArrayList) aVar.f).add(valueOf);
            }
        }
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            long nextFloat = (long) (Utilities.random.nextFloat() * 300);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new wx0(aVar, i12, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new wx0(aVar, i12, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new wx0(aVar, i12, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) aVar.a).add(ofFloat);
            ((ArrayList) aVar.b).add(ofFloat2);
            ((ArrayList) aVar.c).add(ofFloat3);
            i12++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.c, (h5.d) new ag.d(12));
        this.n.postDelayed(new ix0(this, i10), 200L);
        this.s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new pd0(this, 16));
        animatorSet.start();
    }

    public final void r0(Context context) {
        ox0 ox0Var = new ox0(this, context);
        this.containerView = ox0Var;
        ox0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.G;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.k6.V5;
        view.setBackgroundColor(getThemedColor(i11));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        mh.d1 d1Var = new mh.d1(this, context, 21);
        this.c = d1Var;
        d1Var.setTag(14);
        mh.d1 d1Var2 = this.c;
        getContext();
        zi ziVar = new zi(this);
        this.J = ziVar;
        d1Var2.setLayoutManager(ziVar);
        this.J.O = new lh.n5(this, 5);
        this.e = new f2.f0(new px0(this));
        mh.d1 d1Var3 = this.c;
        tx0 tx0Var = new tx0(this, context);
        this.d = tx0Var;
        d1Var3.setAdapter(tx0Var);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.i(new oh.j(6));
        this.c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.c.setClipToPadding(false);
        this.c.setEnabled(true);
        this.c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.A5));
        this.c.setOnTouchListener(new vr(this, 4));
        this.c.setOnScrollListener(new nb0(this, 7));
        k kVar = new k(this, 16);
        this.E = kVar;
        this.c.setOnItemClickListener(kVar);
        this.containerView.addView(this.c, k7.c6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        eg.s2 s2Var = new eg.s2(this, context, 26);
        this.H = s2Var;
        this.containerView.addView(s2Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.c.setEmptyView(this.H);
        this.H.setOnTouchListener(new org.telegram.ui.ActionBar.s2(23));
        g90 g90Var = new g90(context, null);
        this.h = g90Var;
        g90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, k7.c6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.k6.Ji), false, this.resourcesProvider);
        this.n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.n.setSubMenuOpenSide(2);
        this.n.setIcon(R.drawable.ic_ab_other);
        this.n.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.Ni), 1, -1));
        this.containerView.addView(this.n, k7.c6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.n.setOnClickListener(new gx0(this, 1));
        this.n.setDelegate(new hx0(this));
        this.n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.n.setVisibility(this.S != null ? 0 : 8);
        this.H.addView(new RadialProgressView(context, null), k7.c6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(viewArr[1], layoutParams2);
        k6 k6Var = new k6(context, false, false, false);
        this.s = k6Var;
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        k6Var.setBackground(org.telegram.ui.ActionBar.k6.g0(themedColor, getThemedColor(i13)));
        k6 k6Var2 = this.s;
        int i14 = org.telegram.ui.ActionBar.k6.n5;
        this.h0 = i14;
        k6Var2.setTextColor(getThemedColor(i14));
        this.s.setTextSize(AndroidUtilities.dp(14.0f));
        this.s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.addView(this.s, k7.c6.c(48.0f, -1));
        this.containerView.addView(this.w, k7.c6.e(-1, -2, 83));
        fg.b1 b1Var = new fg.b1(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = b1Var;
        b1Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, k7.c6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.x, k7.c6.c(-1.0f, -1));
        this.x.setOnClickListener(new gx0(this, 2));
        p9 p9Var = new p9(context);
        this.C = p9Var;
        p9Var.setAspectFit(true);
        this.C.setLayerNum(7);
        this.x.addView(this.C);
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 30.0f);
        this.D.setGravity(85);
        this.x.addView(this.D);
        TextView textView2 = new TextView(context);
        this.y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.y.setTextColor(getThemedColor(i14));
        this.y.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(i12), getThemedColor(i13)));
        this.y.setGravity(17);
        this.y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.y.setTypeface(AndroidUtilities.bold());
        this.x.addView(this.y, k7.c6.e(-1, 48, 83));
        this.y.setOnClickListener(new gx0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.B = view3;
        view3.setBackgroundColor(getThemedColor(i11));
        this.x.addView(this.B, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.U != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.P;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.N;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
        this.p0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0() {
        String str;
        if (this.S != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.P == null && (str = this.S.short_name) != null) {
                this.P = mediaDataController.getStickerSetByName(str);
            }
            if (this.P == null) {
                this.P = mediaDataController.getStickerSetById(this.S.id);
            }
            if (this.P == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.S;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.lo(14, this, mediaDataController));
            } else {
                if (this.d != null) {
                    C0();
                    B0();
                    this.d.l();
                }
                A0();
                mediaDataController.preloadStickerSetThumb(this.P);
                l0();
            }
        }
        if (this.P != null) {
            this.e0 = !r0.set.masks;
        }
        l0();
    }

    public final void u0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.V.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.V.remove(indexOf);
            this.d.u(indexOf);
            if (this.V.isEmpty()) {
                dismiss();
            } else {
                B0();
            }
        }
    }

    public final void v0(int i10, boolean z4) {
        if (this.T != null) {
            return;
        }
        View[] viewArr = this.G;
        if ((!z4 || viewArr[i10].getTag() == null) && (z4 || viewArr[i10].getTag() != null)) {
            return;
        }
        int i11 = 1;
        viewArr[i10].setTag(z4 ? null : 1);
        if (z4) {
            viewArr[i10].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.F;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i10], (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new da0(this, i10, z4, i11));
        animatorSetArr[i10].start();
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            k6 k6Var = this.s;
            this.h0 = i10;
            k6Var.setTextColor(getThemedColor(i10));
        }
        this.s.c(str, false, true);
        this.s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.G[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
        if (onClickListener == null) {
            this.s.setAlpha(0.0f);
        } else if (i11 < 0 || i12 < 0) {
            this.s.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(org.telegram.ui.ActionBar.k6.h5), org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.k6.q7))));
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
                org.telegram.ui.b.p(this.s.animate().alpha(1.0f), pr.h, 240L);
            }
        } else {
            k6 k6Var2 = this.s;
            int dp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            k6Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
            this.w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
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
                org.telegram.ui.b.p(this.s.animate().alpha(1.0f), pr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.b0 = i10;
        if (this.T == null) {
            float f10 = i10;
            this.h.setTranslationY(f10);
            if (this.U == null) {
                this.n.setTranslationY(f10);
            }
            this.G[0].setTranslationY(f10);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z4) {
        xx0 xx0Var = this.d.r;
        if (xx0Var.T != null) {
            int childCount = xx0Var.c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xx0Var.c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.l5));
        this.x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5) & (-536870913));
        this.n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
        this.n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.k6.I5));
        this.n.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        if (this.r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.q7);
            this.r.c(themedColor, themedColor);
            this.r.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, themedColor));
            if (this.r.getRightIcon() != null) {
                this.r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z4) {
            if (org.telegram.ui.ActionBar.k6.sl != null && this.q0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.q0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.m6) this.q0.get(i11)).h = null;
                }
            }
            int size2 = this.q0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.q0.get(i12);
                m6Var.d(getThemedColor(m6Var.f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.k6.sl == null && this.q0 != null) {
            this.q0 = null;
        }
    }

    public xx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.g0 = true;
        this.i0 = new a9.a(10);
        this.j0 = new lx0(this);
        fixNavigationBar();
        this.K = (Activity) context;
        this.U = arrayList;
        this.X = str;
        Utilities.globalQueue.postRunnable(new jp(this, arrayList, arrayList2, 27));
        r0(context);
    }

    public xx0(Context context, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ux0 ux0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.g0 = true;
        this.i0 = new a9.a(10);
        this.j0 = new lx0(this);
        fixNavigationBar();
        this.Y = ux0Var;
        this.S = inputStickerSet;
        this.P = tL_messages_stickerSet;
        this.I = p2Var;
        t0();
        r0(context);
    }
}
