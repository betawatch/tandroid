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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class vx0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int u0 = 0;
    public View E;
    public u9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ai.f0 K;
    public final org.telegram.ui.ActionBar.n2 L;
    public bi.l M;
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
    public final sx0 b0;
    public ai.w0 c;
    public tx0 c0;
    public rx0 d;
    public org.telegram.ui.o70 d0;
    public s4.y e;
    public int e0;
    public TLRPC.Document f;
    public int f0;
    public boolean g0;
    public c90 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public final com.google.firebase.messaging.n l0;
    public final kx0 m0;
    public org.telegram.ui.ActionBar.v0 n;
    public fr0 n0;
    public String o0;
    public int p0;
    public boolean q0;
    public org.telegram.ui.ActionBar.f1 r;
    public String r0;
    public n6 s;
    public Runnable s0;
    public ArrayList t0;
    public rg.p0 v;
    public FrameLayout w;
    public FrameLayout x;
    public TextView y;

    public vx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new kx0(this);
        this.resourcesProvider = e6Var;
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
        org.telegram.ui.rs0 rs0Var = (org.telegram.ui.rs0) this;
        this.f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.p3(rs0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.qo(15, rs0Var, tL_messages_getAttachedStickers), 7));
        r0(context);
    }

    public static /* synthetic */ void A(vx0 vx0Var) {
        vx0Var.dismiss();
        tx0 tx0Var = vx0Var.c0;
        if (tx0Var != null) {
            tx0Var.a();
        }
        if (vx0Var.V == null || MediaDataController.getInstance(vx0Var.currentAccount).cancelRemovingStickerSet(vx0Var.V.id)) {
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = vx0Var.V;
        ConnectionsManager.getInstance(vx0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new x1(vx0Var, 13));
    }

    public static void B(vx0 vx0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = vx0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vx0Var.S;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(vx0Var.currentAccount).linkPrefix + "/addstickers/" + vx0Var.S.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(vx0Var.currentAccount).linkPrefix + "/addemoji/" + vx0Var.S.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = vx0Var.N;
            if (context == null && n2Var != null) {
                context = n2Var.getParentActivity();
            }
            if (context == null) {
                context = vx0Var.getContext();
            }
            ix0 ix0Var = new ix0(vx0Var, context, str2, str2, vx0Var.resourcesProvider);
            if (n2Var == null) {
                ix0Var.show();
                return;
            }
            n2Var.showDialog(ix0Var);
            if (n2Var instanceof org.telegram.ui.bo) {
                ix0Var.setCalcMandatoryInsets(((org.telegram.ui.bo) n2Var).x9());
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                new vc((FrameLayout) vx0Var.containerView, vx0Var.resourcesProvider).k(false).j();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 3) {
            if (vx0Var.R) {
                vx0Var.n0();
                return;
            } else {
                vx0Var.p0();
                return;
            }
        }
        if (i10 == 4) {
            by0.c(vx0Var.S.set, vx0Var.resourcesProvider, vx0Var.getContext(), new d(vx0Var, 20));
        } else if (i10 == 5) {
            by0.b(vx0Var.S.set, vx0Var.resourcesProvider, vx0Var.getContext(), new gx0(vx0Var, 2));
        }
    }

    public static void E(vx0 vx0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.ActionBar.n2 n2Var = vx0Var.L;
        TLRPC.StickerSet stickerSet = vx0Var.S.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (vx0Var.j0) {
                    oc.g(n2Var, new ax0(vx0Var.w.getContext(), vx0Var.S, 1, 2, null, vx0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(vx0Var.currentAccount).processStickerSetInstallResultArchive(n2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(vx0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(vx0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void F(vx0 vx0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        vx0Var.f0 = 0;
        if (tL_error != null) {
            vx0Var.dismiss();
            org.telegram.ui.ActionBar.n2 n2Var = vx0Var.L;
            if (n2Var != null) {
                org.telegram.messenger.y0.p(R.string.AddStickersNotFound, vc.a0(n2Var), null);
                return;
            }
            return;
        }
        em0 em0Var = new em0(vx0Var, 1);
        em0Var.addTarget(vx0Var.containerView);
        TransitionManager.beginDelayedTransition(vx0Var.container, em0Var);
        vx0Var.n.setVisibility(0);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        vx0Var.S = tL_messages_stickerSet;
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = vx0Var.S;
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
            vx0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = vx0Var.S;
        if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
            z10 = true;
        }
        vx0Var.h0 = z10;
        vx0Var.l0();
        mediaDataController.preloadStickerSetThumb(vx0Var.S);
        vx0Var.C0();
        vx0Var.B0();
        vx0Var.A0();
        vx0Var.d.l();
    }

    public static /* synthetic */ void G(vx0 vx0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        vx0Var.p0 = ConnectionsManager.getInstance(vx0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.t5(vx0Var, str, textView, 12), 2);
    }

    public static void H(vx0 vx0Var) {
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(vx0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vx0Var.S;
        boolean z10 = tL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.id);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = vx0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && vx0Var.r == null) {
            vx0Var.n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            vx0Var.n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                vx0Var.r = vx0Var.n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, vx0Var.getContext(), vx0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, vx0Var.resourcesProvider).setOnClickListener(new ex0(vx0Var, 4));
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, vx0Var.resourcesProvider);
                int themedColor = vx0Var.getThemedColor(org.telegram.ui.ActionBar.i6.q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, vx0Var.resourcesProvider).setOnClickListener(new ex0(vx0Var, 6));
                c10.setOnClickListener(new ex0(vx0Var, 7));
                vx0Var.r = vx0Var.n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            vx0Var.n.a(-1);
            ta0 ta0Var = new ta0(vx0Var.currentAccount, vx0Var.getContext(), vx0Var.resourcesProvider, new ArrayList(), 4);
            ta0Var.setOnClickListener(new ex0(vx0Var, 8));
            ta0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.v0 v0Var = vx0Var.n;
            v0Var.o();
            v0Var.b.a(ta0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = vx0Var.getThemedColor(org.telegram.ui.ActionBar.i6.q7);
            vx0Var.r.c(themedColor2, themedColor2);
            vx0Var.r.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, themedColor2));
            if (vx0Var.r.getRightIcon() != null) {
                vx0Var.r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (vx0Var.n.getPopupLayout() != null) {
            vx0Var.n.getPopupLayout().requestLayout();
        }
        vx0Var.n.M(null, null);
    }

    public static void O(vx0 vx0Var) {
        if (vx0Var.c.getChildCount() <= 0) {
            vx0Var.y0(vx0Var.c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < vx0Var.c.getChildCount(); i12++) {
            View childAt = vx0Var.c.getChildAt(i12);
            vx0Var.c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            vx0Var.v0(0, true);
        } else {
            int top = view.getTop();
            vx0Var.v0(0, false);
            i10 = top;
        }
        vx0Var.v0(1, true);
        if (vx0Var.e0 != i10) {
            vx0Var.y0(i10);
        }
    }

    public static void m(vx0 vx0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof px0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vx0Var.S;
            org.telegram.ui.ActionBar.n2 n2Var = vx0Var.L;
            org.telegram.ui.ActionBar.e6 e6Var = vx0Var.resourcesProvider;
            if (n2Var == null) {
                return;
            }
            Context context = n2Var.getContext();
            if (!(n2Var instanceof org.telegram.ui.bo)) {
                by0.a(tL_messages_stickerSet, n2Var, e6Var);
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, e6Var);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
            org.telegram.ui.Cells.q3.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
            arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
            arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
            arrayList2.add(1);
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            ai.s0 s0Var = new ai.s0(n1Var, arrayList2, tL_messages_stickerSet, n2Var, e6Var, 11);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, e6Var);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(s0Var);
            }
            n1Var.c = 100;
            n1Var.g = true;
            n1Var.setOutsideTouchable(true);
            n1Var.setClippingEnabled(true);
            n1Var.setAnimationStyle(R.style.PopupContextAnimation);
            n1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            n1Var.setInputMethodMode(2);
            n1Var.getContentView().setFocusableInTouchMode(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            n1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
            n1Var.b();
            return;
        }
        if (vx0Var.R) {
            return;
        }
        if (vx0Var.W != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vx0Var.d.f.get(i10);
            if (stickerSetCovered != null) {
                vx0Var.dismiss();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.id = stickerSet2.id;
                new vx0(vx0Var.N, vx0Var.L, tL_inputStickerSetID, null, null, vx0Var.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList arrayList4 = vx0Var.Y;
        if (arrayList4 != null) {
            if (i10 < 0 || i10 >= arrayList4.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) vx0Var.Y.get(i10);
            vx0Var.U = importingSticker;
            if (importingSticker.validated) {
                TextView textView = vx0Var.G;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                vx0Var.F.m(ImageLocation.getForPath(vx0Var.U.path), null, null, null, null, vx0Var.U.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vx0Var.x.getLayoutParams();
                layoutParams.topMargin = vx0Var.e0;
                vx0Var.x.setLayoutParams(layoutParams);
                vx0Var.x.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(vx0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = vx0Var.S;
        if (tL_messages_stickerSet2 == null || i10 < 0 || i10 >= tL_messages_stickerSet2.documents.size()) {
            return;
        }
        vx0Var.T = vx0Var.S.documents.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= vx0Var.T.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = vx0Var.T.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    TextView textView2 = vx0Var.G;
                    textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                }
            } else {
                i12++;
            }
        }
        vx0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(vx0Var.currentAccount).getEmojiForSticker(vx0Var.T.id), vx0Var.G.getPaint().getFontMetricsInt(), false));
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = vx0Var.S;
        if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.st.q().y(view)) {
            vx0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(vx0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(vx0Var.T.thumbs, 90), vx0Var.T), (String) null, "webp", vx0Var.S, 1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vx0Var.x.getLayoutParams();
            layoutParams2.topMargin = vx0Var.e0;
            vx0Var.x.setLayoutParams(layoutParams2);
            vx0Var.x.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(vx0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static /* synthetic */ void n(vx0 vx0Var) {
        vx0Var.n.n();
        by0.b(vx0Var.S.set, vx0Var.resourcesProvider, vx0Var.getContext(), new gx0(vx0Var, 4));
    }

    public static /* synthetic */ void o(org.telegram.ui.rs0 rs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        rs0Var.f0 = 0;
        if (tL_error != null || !(tLObject instanceof Vector)) {
            c5.f0(rs0Var.currentAccount, tL_error, rs0Var.L, tL_messages_getAttachedStickers, new Object[0]);
            rs0Var.dismiss();
            return;
        }
        Vector vector = (Vector) tLObject;
        if (vector.objects.isEmpty()) {
            rs0Var.dismiss();
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            rs0Var.V = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            rs0Var.t0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        rs0Var.W = arrayList;
        arrayList.addAll(vector.objects);
        rs0Var.c.setLayoutParams(w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        rs0Var.h.setVisibility(8);
        rs0Var.J[0].setVisibility(8);
        rs0Var.d.l();
    }

    public static void o0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (n2Var == null) {
            return;
        }
        org.telegram.ui.bo boVar = n2Var instanceof org.telegram.ui.bo ? (org.telegram.ui.bo) n2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new ci.u1((Object) n2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) boVar, z10, 18), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new hg.s0(pathToAttach, arrayList, n2Var, boVar, document, z10, tL_messages_stickerSet), 300L);
    }

    public static /* synthetic */ void p(org.telegram.ui.rs0 rs0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.qo qoVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            qoVar.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(rs0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, qoVar);
        }
    }

    public static /* synthetic */ void q(vx0 vx0Var) {
        vx0Var.dismiss();
        MediaDataController.getInstance(vx0Var.currentAccount).toggleStickerSet(vx0Var.getContext(), vx0Var.S, 0, vx0Var.L, true, vx0Var.j0);
    }

    public static /* synthetic */ void r(vx0 vx0Var) {
        vx0Var.n.n();
        vx0Var.dismiss();
        MediaDataController.getInstance(vx0Var.currentAccount).toggleStickerSet(vx0Var.getContext(), vx0Var.S, 1, vx0Var.L, true, true);
    }

    public static /* synthetic */ void s(vx0 vx0Var) {
        vx0Var.dismiss();
        MediaDataController.getInstance(vx0Var.currentAccount).toggleStickerSet(vx0Var.getContext(), vx0Var.S, 1, vx0Var.L, false, false);
    }

    public static /* synthetic */ void t(vx0 vx0Var) {
        vx0Var.dismiss();
        MediaDataController.getInstance(vx0Var.currentAccount).toggleStickerSet(vx0Var.getContext(), vx0Var.S, 1, vx0Var.L, false, false);
    }

    public static /* synthetic */ boolean v(vx0 vx0Var, MotionEvent motionEvent) {
        if (vx0Var.R) {
            return false;
        }
        return org.telegram.ui.st.q().s(motionEvent, vx0Var.c, vx0Var.H, vx0Var.m0, vx0Var.resourcesProvider);
    }

    public static /* synthetic */ void w(vx0 vx0Var, ArrayList arrayList, Boolean bool) {
        vx0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            vx0Var.dismiss();
            return;
        }
        vx0Var.d.l();
        if (bool.booleanValue()) {
            vx0Var.Z = new HashMap();
            int size = vx0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) vx0Var.Y.get(i10);
                vx0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(vx0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        vx0Var.B0();
    }

    public static void x(vx0 vx0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 == 1) {
            return;
        }
        if (i10 == 0) {
            iArr[0] = 1;
            TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
            String obj = editTextBoldCursor.getText().toString();
            vx0Var.r0 = obj;
            tL_stickers_suggestShortName.title = obj;
            ConnectionsManager.getInstance(vx0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ci.kd(vx0Var, editTextBoldCursor, textView, textView2, iArr));
            return;
        }
        if (i10 == 2) {
            iArr[0] = 3;
            if (!vx0Var.q0) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(vx0Var.currentAccount).prepareImportStickers(vx0Var.r0, vx0Var.o0, vx0Var.a0, vx0Var.Y, new fx0(vx0Var));
            alertDialog$Builder.a.L0.run();
            vx0Var.dismiss();
        }
    }

    public static /* synthetic */ void z(vx0 vx0Var) {
        vx0Var.dismiss();
        MediaDataController.getInstance(vx0Var.currentAccount).toggleStickerSet(vx0Var.getContext(), vx0Var.S, 1, vx0Var.L, true, vx0Var.j0);
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
                w0(new ex0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.i6.n5);
                return;
            }
            c90 c90Var = this.h;
            ArrayList arrayList4 = this.Y;
            c90Var.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.i6.q5);
                this.s.setEnabled(false);
                return;
            }
            ex0 ex0Var = new ex0(this, 13);
            int i12 = R.string.ImportStickers;
            ArrayList arrayList5 = this.Y;
            w0(ex0Var, LocaleController.formatString("ImportStickers", i12, LocaleController.formatPluralString("Stickers", arrayList5 != null ? arrayList5.size() : arrayList3.size(), new Object[0])), org.telegram.ui.ActionBar.i6.n5);
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
                spannableStringBuilder.setSpan(new k4(replaceEmoji.subSequence(start + 1, end).toString(), i10, this), start, end, 0);
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
                    this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new ex0(this, i11), false);
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
        org.telegram.ui.o70 o70Var = this.d0;
        if (o70Var != null) {
            ex0 ex0Var2 = new ex0(this, i13);
            boolean z12 = o70Var.a;
            String string = o70Var.c.N ? LocaleController.getString(z12 ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet) : LocaleController.getString(z12 ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
            boolean z13 = this.d0.a;
            x0(ex0Var2, string, z13 ? org.telegram.ui.ActionBar.i6.q7 : org.telegram.ui.ActionBar.i6.Sh, !z13 ? org.telegram.ui.ActionBar.i6.Oh : -1, z13 ? -1 : org.telegram.ui.ActionBar.i6.Qh);
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
            x0(new ex0(this, 9), formatPluralString, org.telegram.ui.ActionBar.i6.Sh, org.telegram.ui.ActionBar.i6.Oh, org.telegram.ui.ActionBar.i6.Qh);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.S;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            String string2 = z14 ? LocaleController.getString(this.R ? R.string.Done : R.string.EditStickers) : stickerSet8.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            if (z14) {
                x0(new ex0(this, 10), string2, org.telegram.ui.ActionBar.i6.Sh, org.telegram.ui.ActionBar.i6.Oh, org.telegram.ui.ActionBar.i6.Qh);
            } else {
                String str = string2;
                if (this.S.set.official) {
                    w0(new ex0(this, 11), str, org.telegram.ui.ActionBar.i6.q7);
                } else {
                    w0(new ex0(this, 12), str, org.telegram.ui.ActionBar.i6.q7);
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
            this.y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.q7));
            float f7 = min;
            this.F.setLayoutParams(w7.x5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.x5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.y.setVisibility(0);
            this.E.setVisibility(0);
            return;
        }
        if (this.b0 == null || ((tL_messages_stickerSet = this.S) != null && tL_messages_stickerSet.set.masks)) {
            this.y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.x5.e(min, min, 17));
            this.G.setLayoutParams(w7.x5.e(min, min, 17));
            this.y.setVisibility(8);
            this.E.setVisibility(8);
            return;
        }
        this.y.setText(LocaleController.getString(R.string.SendSticker));
        float f10 = min;
        this.F.setLayoutParams(w7.x5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.G.setLayoutParams(w7.x5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.w0 w0Var = this.c;
            if (w0Var != null) {
                int childCount = w0Var.getChildCount();
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
                importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new fr0(this, str, importingSticker, 6));
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
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

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        vx0 vx0Var = this.d.r;
        if (vx0Var.W != null) {
            org.telegram.ui.Cells.s3.a(arrayList, vx0Var.c, w6Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.i6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.i6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.n, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 32, null, null, null, null, i10));
        n6 n6Var = this.s;
        int i12 = org.telegram.ui.ActionBar.i6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(n6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 4, null, null, null, null, this.k0));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.G8));
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
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.w6));
            this.q0 = true;
            this.o0 = str;
            return;
        }
        fr0 fr0Var = this.n0;
        if (fr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
            this.n0 = null;
            this.o0 = null;
            if (this.p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.q5));
            return;
        }
        this.q0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.p7));
        } else {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.F6));
            this.o0 = str;
            fr0 fr0Var2 = new fr0(this, str, textView, 9);
            this.n0 = fr0Var2;
            AndroidUtilities.runOnUIThread(fr0Var2, 300L);
        }
    }

    public final void n0() {
        if (this.R) {
            this.e.e(null);
            this.R = false;
            this.l0.E(true);
            AndroidUtilities.forEachViews((RecyclerView) this.c, (e2.h) new ai.i(25));
            this.n.postDelayed(new gx0(this, 0), 200L);
            this.s.c(LocaleController.getString(R.string.EditStickers), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.st.q().E) {
            org.telegram.ui.st.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        oc.a((FrameLayout) this.containerView, new ai.w4(this, 8));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        oc.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.R) {
            return;
        }
        this.e.e(this.c);
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
            ofFloat.addUpdateListener(new ux0(nVar, i12, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new ux0(nVar, i12, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new ux0(nVar, i12, 5));
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
        AndroidUtilities.forEachViews((RecyclerView) this.c, (e2.h) new ai.i(26));
        this.n.postDelayed(new gx0(this, i10), 200L);
        this.s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new jd0(this, 17));
        animatorSet.start();
    }

    public final void r0(Context context) {
        nx0 nx0Var = new nx0(this, context);
        this.containerView = nx0Var;
        nx0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.i6.V5;
        view.setBackgroundColor(getThemedColor(i11));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.w0 w0Var = new ai.w0(this, context, 23);
        this.c = w0Var;
        w0Var.setTag(14);
        ai.w0 w0Var2 = this.c;
        getContext();
        bi.l lVar = new bi.l(this);
        this.M = lVar;
        w0Var2.setLayoutManager(lVar);
        this.M.O = new ci.x1(this, 5);
        this.e = new s4.y(new ox0(this));
        ai.w0 w0Var3 = this.c;
        rx0 rx0Var = new rx0(this, context);
        this.d = rx0Var;
        w0Var3.setAdapter(rx0Var);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.i(new ai.t(8));
        this.c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.c.setClipToPadding(false);
        this.c.setEnabled(true);
        this.c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        this.c.setOnTouchListener(new vr(this, 4));
        this.c.setOnScrollListener(new kb0(this, 7));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.c.setOnItemClickListener(jVar);
        this.containerView.addView(this.c, w7.x5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ai.f0 f0Var = new ai.f0(this, context, 20);
        this.K = f0Var;
        this.containerView.addView(f0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.c.setEmptyView(this.K);
        this.K.setOnTouchListener(new bi.d(24));
        c90 c90Var = new c90(context, null);
        this.h = c90Var;
        c90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.x5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.i6.Ji), false, this.resourcesProvider);
        this.n = v0Var;
        v0Var.setLongClickEnabled(false);
        this.n.setSubMenuOpenSide(2);
        this.n.setIcon(R.drawable.ic_ab_other);
        this.n.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.Ni), 1, -1));
        this.containerView.addView(this.n, w7.x5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.n.setOnClickListener(new ex0(this, 1));
        this.n.setDelegate(new fx0(this));
        this.n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.n.setVisibility(this.V != null ? 0 : 8);
        this.K.addView(new RadialProgressView(context, null), w7.x5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(viewArr[1], layoutParams2);
        n6 n6Var = new n6(context, false, false, false);
        this.s = n6Var;
        int i12 = org.telegram.ui.ActionBar.i6.h5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.i6.i6;
        n6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(themedColor, getThemedColor(i13)));
        n6 n6Var2 = this.s;
        int i14 = org.telegram.ui.ActionBar.i6.n5;
        this.k0 = i14;
        n6Var2.setTextColor(getThemedColor(i14));
        this.s.setTextSize(AndroidUtilities.dp(14.0f));
        this.s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.addView(this.s, w7.x5.c(48.0f, -1));
        this.containerView.addView(this.w, w7.x5.e(-1, -2, 83));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.x5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.x, w7.x5.c(-1.0f, -1));
        this.x.setOnClickListener(new ex0(this, 2));
        u9 u9Var = new u9(context);
        this.F = u9Var;
        u9Var.setAspectFit(true);
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
        this.y.setTextColor(getThemedColor(i14));
        this.y.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i12), getThemedColor(i13)));
        this.y.setGravity(17);
        this.y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.y.setTypeface(AndroidUtilities.bold());
        this.x.addView(this.y, w7.x5.e(-1, 48, 83));
        this.y.setOnClickListener(new ex0(this, 3));
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

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final void setOnDismissListener(Runnable runnable) {
        this.s0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.qo(14, this, mediaDataController));
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
        animatorSetArr[i10].addListener(new z90(this, i10, z10, i11));
        animatorSetArr[i10].start();
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            n6 n6Var = this.s;
            this.k0 = i10;
            n6Var.setTextColor(getThemedColor(i10));
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
            this.s.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.h5), org.telegram.ui.ActionBar.i6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.i6.q7))));
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
                org.telegram.messenger.vl.r(this.s.animate().alpha(1.0f), qr.h, 240L);
            }
        } else {
            n6 n6Var2 = this.s;
            int dp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            n6Var2.setBackground(org.telegram.ui.ActionBar.i6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
            this.w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
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
                org.telegram.messenger.vl.r(this.s.animate().alpha(1.0f), qr.h, 240L);
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
        vx0 vx0Var = this.d.r;
        if (vx0Var.W != null) {
            int childCount = vx0Var.c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = vx0Var.c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.i6.l5));
        this.x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.h5) & (-536870913));
        this.n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ji));
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
        this.n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.i6.I5));
        this.n.B(getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        if (this.r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.q7);
            this.r.c(themedColor, themedColor);
            this.r.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, themedColor));
            if (this.r.getRightIcon() != null) {
                this.r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.i6.sl != null && this.t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.k6) this.t0.get(i11)).h = null;
                }
            }
            int size2 = this.t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.t0.get(i12);
                k6Var.d(getThemedColor(k6Var.f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.i6.sl == null && this.t0 != null) {
            this.t0 = null;
        }
    }

    public vx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new kx0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.a0 = str;
        Utilities.globalQueue.postRunnable(new fr0(this, arrayList, arrayList2, 10));
        r0(context);
    }

    public vx0(Context context, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, sx0 sx0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new kx0(this);
        fixNavigationBar();
        this.b0 = sx0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = n2Var;
        t0();
        r0(context);
    }
}
