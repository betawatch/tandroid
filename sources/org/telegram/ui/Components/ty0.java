package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class ty0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int w0 = 0;
    public View E;
    public w9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ah.x K;
    public final org.telegram.ui.ActionBar.o2 L;
    public di.k M;
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
    public final qy0 b0;
    public ai.u1 c;
    public ry0 c0;
    public py0 d;
    public org.telegram.ui.z60 d0;
    public s4.y e;
    public int e0;
    public TLRPC.Document f;
    public int f0;
    public boolean g0;
    public y90 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public final com.google.firebase.messaging.l l0;
    public final iy0 m0;
    public org.telegram.ui.ActionBar.u0 n;
    public fy0 n0;
    public String o0;
    public int p0;
    public boolean q0;
    public org.telegram.ui.ActionBar.e1 r;
    public String r0;
    public q6 s;
    public Runnable s0;
    public ArrayList t0;
    public int u0;
    public sg.p0 v;
    public int v0;
    public FrameLayout w;
    public FrameLayout x;
    public TextView y;

    public ty0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new iy0(this);
        this.resourcesProvider = g6Var;
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
        org.telegram.ui.as0 as0Var = (org.telegram.ui.as0) this;
        this.f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.k2(as0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.vc(22, as0Var, tL_messages_getAttachedStickers), 12));
        t0(context);
    }

    public static void A(ty0 ty0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 == 1) {
            return;
        }
        if (i10 == 0) {
            iArr[0] = 1;
            TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
            String obj = editTextBoldCursor.getText().toString();
            ty0Var.r0 = obj;
            tL_stickers_suggestShortName.title = obj;
            ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ai.s9(ty0Var, editTextBoldCursor, textView, textView2, iArr, 7));
            return;
        }
        if (i10 == 2) {
            iArr[0] = 3;
            if (!ty0Var.q0) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(ty0Var.currentAccount).prepareImportStickers(ty0Var.r0, ty0Var.o0, ty0Var.a0, ty0Var.Y, new dy0(ty0Var));
            alertDialog$Builder.a.N0.run();
            ty0Var.dismiss();
        }
    }

    public static /* synthetic */ void C(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, true, ty0Var.j0);
    }

    public static /* synthetic */ void D(ty0 ty0Var) {
        ty0Var.dismiss();
        ry0 ry0Var = ty0Var.c0;
        if (ry0Var != null) {
            ry0Var.a();
        }
        if (ty0Var.V == null || MediaDataController.getInstance(ty0Var.currentAccount).cancelRemovingStickerSet(ty0Var.V.id)) {
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = ty0Var.V;
        ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new x1(ty0Var, 13));
    }

    public static void E(ty0 ty0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(ty0Var.currentAccount).linkPrefix + "/addstickers/" + ty0Var.S.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(ty0Var.currentAccount).linkPrefix + "/addemoji/" + ty0Var.S.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = ty0Var.N;
            if (context == null && o2Var != null) {
                context = o2Var.getParentActivity();
            }
            if (context == null) {
                context = ty0Var.getContext();
            }
            gy0 gy0Var = new gy0(ty0Var, context, str2, str2, ty0Var.resourcesProvider);
            if (o2Var == null) {
                gy0Var.show();
                return;
            }
            o2Var.showDialog(gy0Var);
            if (o2Var instanceof org.telegram.ui.sn) {
                gy0Var.setCalcMandatoryInsets(((org.telegram.ui.sn) o2Var).C9());
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                new xc((FrameLayout) ty0Var.containerView, ty0Var.resourcesProvider).k(false).j();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 3) {
            if (ty0Var.R) {
                ty0Var.p0();
                return;
            } else {
                ty0Var.r0();
                return;
            }
        }
        if (i10 == 4) {
            yy0.c(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new d(ty0Var, 20));
        } else if (i10 == 5) {
            yy0.b(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new ey0(ty0Var, 2));
        }
    }

    public static void F(ty0 ty0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
        TLRPC.StickerSet stickerSet = ty0Var.S.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        try {
            if (tL_error == null) {
                if (ty0Var.j0) {
                    qc.g(o2Var, new yx0(ty0Var.w.getContext(), ty0Var.S, 1, 2, null, ty0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(ty0Var.currentAccount).processStickerSetInstallResultArchive(o2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(ty0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(ty0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void G(ty0 ty0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        ty0Var.f0 = 0;
        if (tL_error != null) {
            ty0Var.dismiss();
            org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
            if (o2Var != null) {
                org.telegram.messenger.sl.q(R.string.AddStickersNotFound, xc.a0(o2Var), null);
                return;
            }
            return;
        }
        gn0 gn0Var = new gn0(ty0Var, 1);
        gn0Var.addTarget(ty0Var.containerView);
        TransitionManager.beginDelayedTransition(ty0Var.container, gn0Var);
        ty0Var.n.setVisibility(0);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        ty0Var.S = tL_messages_stickerSet;
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
            ty0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ty0Var.S;
        if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
            z10 = true;
        }
        ty0Var.h0 = z10;
        ty0Var.n0();
        mediaDataController.preloadStickerSetThumb(ty0Var.S);
        ty0Var.E0();
        ty0Var.D0();
        ty0Var.C0();
        ty0Var.d.l();
    }

    public static /* synthetic */ void I(ty0 ty0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        ty0Var.p0 = ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.j2(ty0Var, str, textView, 17), 2);
    }

    public static void J(ty0 ty0Var) {
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(ty0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
        boolean z10 = tL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.id);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && ty0Var.r == null) {
            ty0Var.n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            ty0Var.n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                ty0Var.r = ty0Var.n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, ty0Var.getContext(), ty0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, ty0Var.resourcesProvider).setOnClickListener(new cy0(ty0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, ty0Var.resourcesProvider);
                int i10 = org.telegram.ui.ActionBar.k6.q7;
                ty0Var.getThemedColor(i10);
                c10.c(i10, i10);
                c10.h(0.1f, i10);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, ty0Var.resourcesProvider).setOnClickListener(new cy0(ty0Var, 6));
                c10.setOnClickListener(new cy0(ty0Var, 7));
                ty0Var.r = ty0Var.n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            ty0Var.n.a(-1);
            pb0 pb0Var = new pb0(ty0Var.currentAccount, 4, ty0Var.getContext(), new ArrayList(), ty0Var.resourcesProvider);
            pb0Var.setOnClickListener(new cy0(ty0Var, 8));
            pb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = ty0Var.n;
            u0Var.o();
            u0Var.b.a(pb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor = ty0Var.getThemedColor(org.telegram.ui.ActionBar.k6.q7);
            ty0Var.r.d(themedColor, themedColor);
            ty0Var.r.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.1f, themedColor));
            if (ty0Var.r.getRightIcon() != null) {
                ty0Var.r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (ty0Var.n.getPopupLayout() != null) {
            ty0Var.n.getPopupLayout().requestLayout();
        }
        ty0Var.n.M(null, null);
    }

    public static void Q(ty0 ty0Var) {
        if (ty0Var.c.getChildCount() <= 0) {
            ty0Var.A0(ty0Var.c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < ty0Var.c.getChildCount(); i12++) {
            View childAt = ty0Var.c.getChildAt(i12);
            ty0Var.c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            ty0Var.x0(0, true);
        } else {
            int top = view.getTop();
            ty0Var.x0(0, false);
            i10 = top;
        }
        ty0Var.x0(1, true);
        if (ty0Var.e0 != i10) {
            ty0Var.A0(i10);
        }
    }

    public static void m(ty0 ty0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof ny0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
            org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
            org.telegram.ui.ActionBar.g6 g6Var = ty0Var.resourcesProvider;
            if (o2Var == null) {
                return;
            }
            Context context = o2Var.getContext();
            if (!(o2Var instanceof org.telegram.ui.sn)) {
                yy0.a(tL_messages_stickerSet, o2Var, g6Var);
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, g6Var);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
            org.telegram.ui.Cells.b1.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
            arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
            arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
            arrayList2.add(1);
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            ci.e0 e0Var = new ci.e0(m1Var, arrayList2, tL_messages_stickerSet, o2Var, g6Var, 11);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, g6Var);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(e0Var);
            }
            m1Var.c = 100;
            m1Var.g = true;
            m1Var.setOutsideTouchable(true);
            m1Var.setClippingEnabled(true);
            m1Var.setAnimationStyle(R.style.PopupContextAnimation);
            m1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            m1Var.setInputMethodMode(2);
            m1Var.getContentView().setFocusableInTouchMode(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            m1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
            m1Var.b();
            return;
        }
        if (ty0Var.R) {
            return;
        }
        if (ty0Var.W != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) ty0Var.d.f.get(i10);
            if (stickerSetCovered != null) {
                ty0Var.dismiss();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.id = stickerSet2.id;
                new ty0(ty0Var.N, ty0Var.L, tL_inputStickerSetID, null, null, ty0Var.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList arrayList4 = ty0Var.Y;
        if (arrayList4 != null) {
            if (i10 < 0 || i10 >= arrayList4.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ty0Var.Y.get(i10);
            ty0Var.U = importingSticker;
            if (importingSticker.validated) {
                TextView textView = ty0Var.G;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                ty0Var.F.m(ImageLocation.getForPath(ty0Var.U.path), null, null, null, null, ty0Var.U.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ty0Var.x.getLayoutParams();
                layoutParams.topMargin = ty0Var.e0;
                ty0Var.x.setLayoutParams(layoutParams);
                ty0Var.x.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(ty0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
        if (tL_messages_stickerSet2 == null || i10 < 0 || i10 >= tL_messages_stickerSet2.documents.size()) {
            return;
        }
        ty0Var.T = ty0Var.S.documents.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= ty0Var.T.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = ty0Var.T.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    TextView textView2 = ty0Var.G;
                    textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                }
            } else {
                i12++;
            }
        }
        ty0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(ty0Var.currentAccount).getEmojiForSticker(ty0Var.T.id), ty0Var.G.getPaint().getFontMetricsInt(), false));
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ty0Var.S;
        if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.ht.o().w(view)) {
            ty0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(ty0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(ty0Var.T.thumbs, 90), ty0Var.T), (String) null, "webp", ty0Var.S, 1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ty0Var.x.getLayoutParams();
            layoutParams2.topMargin = ty0Var.e0;
            ty0Var.x.setLayoutParams(layoutParams2);
            ty0Var.x.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ty0Var.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static /* synthetic */ void n(ty0 ty0Var) {
        ty0Var.n.n();
        yy0.b(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new ey0(ty0Var, 4));
    }

    public static void p(ty0 ty0Var) {
        Context context = ty0Var.getContext();
        int[] iArr = {0};
        FrameLayout frameLayout = new FrameLayout(context);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
        alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ud0(19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        TextView textView = new TextView(context);
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.t5, ty0Var.resourcesProvider);
        g10.setMaxLines(1);
        g10.setLines(1);
        g10.setText("t.me/addstickers/");
        g10.setInputType(16385);
        g10.setGravity(51);
        g10.setSingleLine(true);
        g10.setVisibility(4);
        g10.setImeOptions(6);
        g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        frameLayout.addView(g10, w7.z5.e(-2, 36, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.r6.H(editTextBoldCursor, org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, org.telegram.ui.ActionBar.k6.j5, ty0Var.resourcesProvider);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, ty0Var.resourcesProvider);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        editTextBoldCursor.addTextChangedListener(new hy0(ty0Var, iArr, textView, editTextBoldCursor));
        frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
        editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 8));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 23));
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
        textView.setTextSize(1, 14.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q5, ty0Var.resourcesProvider);
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        i2 i2Var = new i2(editTextBoldCursor, 2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setOnShowListener(i2Var);
        c2Var.show();
        editTextBoldCursor.requestFocus();
        c2Var.d(-1).setOnClickListener(new m0(ty0Var, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
    }

    public static /* synthetic */ void q(org.telegram.ui.as0 as0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        as0Var.f0 = 0;
        if (tL_error != null || !(tLObject instanceof Vector)) {
            f5.f0(as0Var.currentAccount, tL_error, as0Var.L, tL_messages_getAttachedStickers, new Object[0]);
            as0Var.dismiss();
            return;
        }
        Vector vector = (Vector) tLObject;
        if (vector.objects.isEmpty()) {
            as0Var.dismiss();
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            as0Var.V = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            as0Var.v0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        as0Var.W = arrayList;
        arrayList.addAll(vector.objects);
        as0Var.c.setLayoutParams(w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        as0Var.h.setVisibility(8);
        as0Var.J[0].setVisibility(8);
        as0Var.d.l();
    }

    public static void q0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (o2Var == null) {
            return;
        }
        org.telegram.ui.sn snVar = o2Var instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) o2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new ei.s1((Object) o2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) snVar, z10, 18), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ig.q0(pathToAttach, arrayList, o2Var, snVar, document, z10, tL_messages_stickerSet), 300L);
    }

    public static /* synthetic */ void r(org.telegram.ui.as0 as0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.vc vcVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            vcVar.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(as0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, vcVar);
        }
    }

    public static /* synthetic */ void s(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 0, ty0Var.L, true, ty0Var.j0);
    }

    public static /* synthetic */ void t(ty0 ty0Var) {
        ty0Var.n.n();
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, true, true);
    }

    public static /* synthetic */ void u(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, false, false);
    }

    public static /* synthetic */ void v(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, false, false);
    }

    public static /* synthetic */ void w(ty0 ty0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        ty0Var.p0 = 0;
        String str2 = ty0Var.o0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.w6, ty0Var.resourcesProvider);
            ty0Var.q0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p7, ty0Var.resourcesProvider);
            ty0Var.q0 = false;
        }
    }

    public static /* synthetic */ boolean y(ty0 ty0Var, MotionEvent motionEvent) {
        if (ty0Var.R) {
            return false;
        }
        return org.telegram.ui.ht.o().q(motionEvent, ty0Var.c, ty0Var.H, ty0Var.m0, ty0Var.resourcesProvider);
    }

    public static /* synthetic */ void z(ty0 ty0Var, ArrayList arrayList, Boolean bool) {
        ty0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            ty0Var.dismiss();
            return;
        }
        ty0Var.d.l();
        if (bool.booleanValue()) {
            ty0Var.Z = new HashMap();
            int size = ty0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ty0Var.Y.get(i10);
                ty0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(ty0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        ty0Var.D0();
    }

    public final void A0(int i10) {
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

    public final void B0(boolean z10) {
        this.d.getClass();
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.l5));
        this.x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5) & (-536870913));
        this.n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        this.n.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
        this.n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.k6.I5));
        this.n.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        if (this.r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.q7);
            this.r.d(themedColor, themedColor);
            this.r.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.1f, themedColor));
            if (this.r.getRightIcon() != null && themedColor != this.u0) {
                this.u0 = themedColor;
                this.r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.k6.g1() && this.t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.t6) this.t0.get(i10)).g = null;
                }
            }
            int size2 = this.t0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.t0.get(i11);
                t6Var.e(getThemedColor(t6Var.e), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.k6.g1() || this.t0 == null) {
            return;
        }
        this.t0 = null;
    }

    public final void C0() {
        if (this.containerView == null || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        MessageObject.isPremiumEmojiPack(this.S);
    }

    public final void D0() {
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
                y0(new cy0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.k6.n5);
                return;
            }
            y90 y90Var = this.h;
            ArrayList arrayList4 = this.Y;
            y90Var.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                y0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.k6.q5);
                this.s.setEnabled(false);
                return;
            }
            cy0 cy0Var = new cy0(this, 13);
            int i12 = R.string.ImportStickers;
            ArrayList arrayList5 = this.Y;
            y0(cy0Var, LocaleController.formatString("ImportStickers", i12, LocaleController.formatPluralString("Stickers", arrayList5 != null ? arrayList5.size() : arrayList3.size(), new Object[0])), org.telegram.ui.ActionBar.k6.n5);
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
                spannableStringBuilder.setSpan(new m4(replaceEmoji.subSequence(start + 1, end).toString(), i10, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                replaceEmoji = spannableStringBuilder;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.h.setText(replaceEmoji);
        int i13 = 5;
        if (u0()) {
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
                    y0(null, null, -1);
                    this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new cy0(this, i11), false);
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
        org.telegram.ui.z60 z60Var = this.d0;
        if (z60Var != null) {
            cy0 cy0Var2 = new cy0(this, i13);
            boolean z12 = z60Var.a;
            String string = z60Var.c.N ? LocaleController.getString(z12 ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet) : LocaleController.getString(z12 ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
            boolean z13 = this.d0.a;
            z0(cy0Var2, string, z13 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.Sh, !z13 ? org.telegram.ui.ActionBar.k6.Oh : -1, z13 ? -1 : org.telegram.ui.ActionBar.k6.Qh);
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
                z0(null, "", -1, -1, -1);
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
            z0(new cy0(this, 9), formatPluralString, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.S;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            String string2 = z14 ? LocaleController.getString(this.R ? R.string.Done : R.string.EditStickers) : stickerSet8.masks ? LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            if (z14) {
                z0(new cy0(this, 10), string2, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
            } else {
                String str = string2;
                if (this.S.set.official) {
                    y0(new cy0(this, 11), str, org.telegram.ui.ActionBar.k6.q7);
                } else {
                    y0(new cy0(this, 12), str, org.telegram.ui.ActionBar.k6.q7);
                }
            }
        }
        this.d.l();
    }

    public final void E0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            org.telegram.ui.ActionBar.r6.W(this.y, org.telegram.ui.ActionBar.k6.q7, this.resourcesProvider);
            float f7 = min;
            this.F.setLayoutParams(w7.z5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.z5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.y.setVisibility(0);
            this.E.setVisibility(0);
            return;
        }
        if (this.b0 == null || ((tL_messages_stickerSet = this.S) != null && tL_messages_stickerSet.set.masks)) {
            this.y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.z5.e(min, min, 17));
            this.G.setLayoutParams(w7.z5.e(min, min, 17));
            this.y.setVisibility(8);
            this.E.setVisibility(8);
            return;
        }
        this.y.setText(LocaleController.getString(R.string.SendSticker));
        float f10 = min;
        this.F.setLayoutParams(w7.z5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.G.setLayoutParams(w7.z5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.y.setVisibility(0);
        this.E.setVisibility(0);
    }

    public final void F0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            E0();
            D0();
            this.d.l();
        }
        C0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l5));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.u1 u1Var = this.c;
            if (u1Var != null) {
                int childCount = u1Var.getChildCount();
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
                importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new lg(this, str, importingSticker, 27));
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
                w0(importingSticker2);
            }
            if (this.Z.isEmpty()) {
                D0();
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
                v0();
            }
            D0();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        super.dismiss();
        this.l0.B(false);
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
        z6 z6Var = new z6(this, 6);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        if (this.d.r.W != null) {
            org.telegram.ui.Cells.r3.a(arrayList, z6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        q6 q6Var = this.s;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.k0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    public final void n0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void o0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.w6, this.resourcesProvider);
            this.q0 = true;
            this.o0 = str;
            return;
        }
        fy0 fy0Var = this.n0;
        if (fy0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fy0Var);
            this.n0 = null;
            this.o0 = null;
            if (this.p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q5, this.resourcesProvider);
            return;
        }
        this.q0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p7, this.resourcesProvider);
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p7, this.resourcesProvider);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p7, this.resourcesProvider);
        } else {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p7, this.resourcesProvider);
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.F6, this.resourcesProvider);
            this.o0 = str;
            fy0 fy0Var2 = new fy0(this, str, textView, 0);
            this.n0 = fy0Var2;
            AndroidUtilities.runOnUIThread(fy0Var2, 300L);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ht.o().E) {
            org.telegram.ui.ht.o().m();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        qc.a((FrameLayout) this.containerView, new ah.m0(this, 9));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        B0(false);
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
            if (this.shadowDrawable != null && themedColor != this.v0) {
                this.v0 = themedColor;
                setBackgroundColor(themedColor);
            }
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        if (this.R) {
            this.e.d(null);
            this.R = false;
            this.l0.B(true);
            AndroidUtilities.forEachViews((RecyclerView) this.c, (Utilities.Callback<View>) new ci.e(14));
            this.n.postDelayed(new ey0(this, 0), 200L);
            this.s.c(LocaleController.getString(R.string.EditStickers), true, true);
        }
    }

    public final void r0() {
        if (this.R) {
            return;
        }
        this.e.d(this.c);
        int i10 = 1;
        this.R = true;
        com.google.firebase.messaging.l lVar = this.l0;
        boolean z10 = false;
        lVar.B(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) lVar.d;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < 6; i11++) {
                arrayList.add(valueOf);
                ((ArrayList) lVar.e).add(valueOf);
                ((ArrayList) lVar.f).add(valueOf);
            }
        }
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            long nextFloat = (long) (Utilities.random.nextFloat() * 300);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new sy0(lVar, i12, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            boolean z11 = z10;
            float dp = AndroidUtilities.dp(0.5f);
            float f10 = f7;
            float[] fArr = new float[5];
            fArr[z11 ? 1 : 0] = f10;
            fArr[1] = dp;
            fArr[2] = f10;
            fArr[3] = -dp;
            fArr[4] = f10;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new sy0(lVar, i12, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[z11 ? 1 : 0] = f10;
            fArr2[1] = dp;
            fArr2[2] = f10 - dp;
            fArr2[3] = f10;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new sy0(lVar, i12, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) lVar.a).add(ofFloat);
            ((ArrayList) lVar.b).add(ofFloat2);
            ((ArrayList) lVar.c).add(ofFloat3);
            i12++;
            f7 = f10;
            z10 = z11 ? 1 : 0;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.c, (Utilities.Callback<View>) new ci.e(15));
        this.n.postDelayed(new ey0(this, i10), 200L);
        this.s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void s0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new i60(this, 24));
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
        this.s0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0(Context context) {
        ly0 ly0Var = new ly0(this, context);
        this.containerView = ly0Var;
        ly0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i11, view, this.resourcesProvider);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.u1 u1Var = new ai.u1(this, context, 24);
        this.c = u1Var;
        u1Var.setTag(14);
        ai.u1 u1Var2 = this.c;
        getContext();
        di.k kVar = new di.k(this);
        this.M = kVar;
        u1Var2.setLayoutManager(kVar);
        this.M.O = new ai.q1(this, 6);
        this.e = new s4.y(new my0(this));
        ai.u1 u1Var3 = this.c;
        py0 py0Var = new py0(this, context);
        this.d = py0Var;
        u1Var3.setAdapter(py0Var);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.i(new ci.l(8));
        this.c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.c.setClipToPadding(false);
        this.c.setEnabled(true);
        org.telegram.ui.ActionBar.r6.J(this.c, org.telegram.ui.ActionBar.k6.A5, this.resourcesProvider);
        this.c.setOnTouchListener(new rk(this, 6));
        this.c.setOnScrollListener(new kv(this, 11));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.c.setOnItemClickListener(jVar);
        this.containerView.addView(this.c, w7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ah.x xVar = new ah.x(this, context, 23);
        this.K = xVar;
        this.containerView.addView(xVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.c.setEmptyView(this.K);
        this.K.setOnTouchListener(new di.d(24));
        y90 y90Var = new y90(context, null);
        this.h = y90Var;
        y90Var.setLines(1);
        this.h.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.W(this.h, org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider);
        this.h.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.I(this.h, org.telegram.ui.ActionBar.k6.k5, this.resourcesProvider);
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.k6.Ji), false, this.resourcesProvider);
        this.n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.n.setSubMenuOpenSide(2);
        this.n.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.n;
        int i12 = org.telegram.ui.ActionBar.k6.Ni;
        org.telegram.ui.ActionBar.r6.S(u0Var2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i12), this.resourcesProvider);
        this.containerView.addView(this.n, w7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.n.setOnClickListener(new cy0(this, 1));
        this.n.setDelegate(new dy0(this));
        this.n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.n.setVisibility(this.V != null ? 0 : 8);
        this.K.addView(new RadialProgressView(context, null), w7.z5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.r6.i(i11, view2, this.resourcesProvider);
        this.containerView.addView(viewArr[1], layoutParams2);
        q6 q6Var = new q6(context, false, false, false);
        this.s = q6Var;
        int i13 = org.telegram.ui.ActionBar.k6.h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(themedColor, getThemedColor(i14));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        q6Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q6Var, h02, O, O2, g6Var);
        q6 q6Var2 = this.s;
        int i15 = org.telegram.ui.ActionBar.k6.n5;
        this.k0 = i15;
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i15, this.resourcesProvider);
        this.s.setTextSize(AndroidUtilities.dp(14.0f));
        this.s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.s.setTypeface(AndroidUtilities.bold());
        this.s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.addView(this.s, w7.z5.c(48.0f, -1));
        this.containerView.addView(this.w, w7.z5.e(-1, -2, 83));
        sg.p0 p0Var = new sg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.z5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.x, w7.z5.c(-1.0f, -1));
        this.x.setOnClickListener(new cy0(this, 2));
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
        org.telegram.ui.ActionBar.r6.W(this.y, i15, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.S(this.y, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i13), getThemedColor(i14)), org.telegram.ui.ActionBar.r6.O(i13), org.telegram.ui.ActionBar.r6.O(i14), this.resourcesProvider);
        this.y.setGravity(17);
        this.y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.y.setTypeface(AndroidUtilities.bold());
        this.x.addView(this.y, w7.z5.e(-1, 48, 83));
        this.y.setOnClickListener(new cy0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        org.telegram.ui.ActionBar.r6.i(i11, view3, this.resourcesProvider);
        this.x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        D0();
        E0();
        C0();
        B0(false);
        this.d.l();
    }

    public final boolean u0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.Q;
        }
        return true;
    }

    public final void v0() {
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.vc(21, this, mediaDataController));
            } else {
                if (this.d != null) {
                    E0();
                    D0();
                    this.d.l();
                }
                C0();
                mediaDataController.preloadStickerSetThumb(this.S);
                n0();
            }
        }
        if (this.S != null) {
            this.h0 = !r0.set.masks;
        }
        n0();
    }

    public final void w0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                D0();
            }
        }
    }

    public final void x0(int i10, boolean z10) {
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
        animatorSetArr[i10].addListener(new va0(this, i10, z10, i11));
        animatorSetArr[i10].start();
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10) {
        z0(onClickListener, str, i10, -1, -1);
    }

    public final void z0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            q6 q6Var = this.s;
            this.k0 = i10;
            org.telegram.ui.ActionBar.r6.a0(q6Var, i10, this.resourcesProvider);
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
            q6 q6Var2 = this.s;
            int i13 = org.telegram.ui.ActionBar.k6.h5;
            int themedColor = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.k6.q7;
            org.telegram.ui.ActionBar.r6.S(q6Var2, org.telegram.ui.ActionBar.k6.h0(themedColor, org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i14))), org.telegram.ui.ActionBar.r6.O(i13), org.telegram.ui.ActionBar.r6.M(0.1f, i14), this.resourcesProvider);
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
                org.telegram.messenger.sl.t(this.s.animate().alpha(1.0f), bs.h, 240L);
            }
        } else {
            q6 q6Var3 = this.s;
            int dp2 = AndroidUtilities.dp(24.0f);
            int themedColor2 = getThemedColor(i11);
            int themedColor3 = getThemedColor(i12);
            org.telegram.ui.ActionBar.r6.S(q6Var3, org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, themedColor2, themedColor3, themedColor3), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), this.resourcesProvider);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this.w, this.resourcesProvider);
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
                org.telegram.messenger.sl.t(this.s.animate().alpha(1.0f), bs.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public ty0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.g6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new iy0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.a0 = str;
        Utilities.globalQueue.postRunnable(new fy0(this, arrayList, arrayList2, 1));
        t0(context);
    }

    public ty0(Context context, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, qy0 qy0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.j0 = true;
        this.l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new iy0(this);
        fixNavigationBar();
        this.b0 = qy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = o2Var;
        v0();
        t0(context);
    }
}
