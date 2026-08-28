package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final int a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.o9 d;
    public final jh0 e;
    public final TextView f;
    public final zf.p0 h;
    public AnimatorSet n;
    public TLRPC.StickerSetCovered r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public Long y;

    public p3(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = UserConfig.selectedAccount;
        TextView textView = new TextView(context);
        this.b = textView;
        ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z10 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 22.0f : 71.0f, 10.0f, z10 ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, z11 ? 5 : 3, z11 ? 100.0f : 71.0f, 35.0f, z11 ? 71.0f : 100.0f, 0.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setLayerNum(1);
        boolean z12 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(48, 48.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 12.0f, 8.0f, z12 ? 12.0f : 0.0f, 0.0f));
        jh0 jh0Var = new jh0(context);
        this.e = jh0Var;
        jh0Var.setText(LocaleController.getString(R.string.Add));
        jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.l0.q(textView3, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Rh, false), 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.StickersRemove));
        addView(textView3, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(4.0f), context, b6Var, false);
        this.h = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new a(this, 4), false);
        p0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.h, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        jh0 jh0Var2 = this.e;
        jh0Var2.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        jh0Var2.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, w02));
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, boolean z12) {
        TLRPC.StickerSetCovered stickerSetCovered2;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.n;
        TLRPC.Document document = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        this.w = z10;
        this.r = stickerSetCovered;
        setWillNotDraw(!z10);
        String str = this.r.set.title;
        TextView textView = this.b;
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        this.c.setText(LocaleController.formatPluralString(stickerSet2.emojis ? "EmojiCount" : "Stickers", stickerSet2.count, new Object[0]));
        boolean z13 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i9 = this.a;
        if (!z13 || (stickerSet = stickerSetCovered.set) == null) {
            TLRPC.Document document2 = stickerSetCovered.cover;
            if (document2 == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                    if (stickerSetCovered.set != null) {
                        for (int i10 = 0; i10 < stickerSetCovered.covers.size(); i10++) {
                            if (stickerSetCovered.covers.get(i10).id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i10);
                            }
                        }
                    }
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                        TLRPC.Document document3 = arrayList2.get(0);
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (arrayList2.get(i11).id == stickerSetCovered.set.thumb_document_id) {
                                document2 = arrayList2.get(i11);
                            }
                        }
                        document = document3;
                    }
                }
            }
            document = document2;
            break;
        }
        this.y = Long.valueOf(stickerSet.id);
        if (!this.x) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupStickersDidLoad);
            this.x = true;
        }
        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i9).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false);
        if (stickerSet3 != null && (arrayList = stickerSet3.documents) != null && !arrayList.isEmpty()) {
            document = stickerSet3.documents.get(0);
            int i12 = 0;
            while (true) {
                if (i12 >= stickerSet3.documents.size()) {
                    break;
                }
                if (stickerSet3.documents.get(i12).id == stickerSetCovered.set.thumb_document_id) {
                    document = stickerSet3.documents.get(i12);
                    break;
                }
                i12++;
            }
        }
        org.telegram.ui.Components.o9 o9Var = this.d;
        if (document != null) {
            if (MessageObject.canAutoplayAnimatedSticker(document)) {
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null) {
                    closestPhotoSizeWithSize = document;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.f6.a7, 1.0f);
                boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                ImageLocation forDocument = z14 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
                if (z14 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                    if (svgThumb != null) {
                        o9Var.n(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered);
                    } else {
                        o9Var.j(ImageLocation.getForDocument(document), "50_50", forDocument, null, 0, stickerSetCovered);
                    }
                } else if (forDocument == null || forDocument.imageType != 1) {
                    o9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                } else {
                    o9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if (closestPhotoSizeWithSize2 != null) {
                    o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    o9Var.i(ImageLocation.getForDocument(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            o9Var.i(null, null, "webp", null, stickerSetCovered2);
        }
        jh0 jh0Var = this.e;
        jh0Var.setVisibility(0);
        this.A = z11;
        this.s = z11 || MediaDataController.getInstance(i9).isStickerPackInstalled(stickerSetCovered2.set.id);
        boolean z15 = !UserConfig.getInstance(i9).isPremium() && MessageObject.isPremiumEmojiPack(stickerSetCovered2);
        this.v = z15;
        zf.p0 p0Var = this.h;
        TextView textView2 = this.f;
        if (z12) {
            if (z15) {
                p0Var.setVisibility(0);
                textView2.setVisibility(0);
                jh0Var.setVisibility(0);
            } else {
                p0Var.setVisibility(0);
                if (this.s) {
                    textView2.setVisibility(0);
                } else {
                    jh0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.n;
            float[] fArr = {(!this.s || this.v) ? 0.0f : 1.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {(!this.s || this.v) ? 0.0f : 1.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {(!this.s || this.v) ? 0.0f : 1.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(jh0Var, (Property<jh0, Float>) property, (this.s || this.v) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(jh0Var, (Property<jh0, Float>) property2, (this.s || this.v) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p0Var, (Property<zf.p0, Float>) property3, !this.v ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p0Var, (Property<zf.p0, Float>) property2, !this.v ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p0Var, (Property<zf.p0, Float>) property3, !this.v ? 0.0f : 1.0f));
            this.n.addListener(new n3(this));
            this.n.setInterpolator(new OvershootInterpolator(1.02f));
            this.n.start();
            return;
        }
        if (z15) {
            p0Var.setVisibility(0);
            p0Var.setAlpha(1.0f);
            p0Var.setScaleX(1.0f);
            p0Var.setScaleY(1.0f);
            jh0Var.setVisibility(4);
            jh0Var.setAlpha(0.0f);
            jh0Var.setScaleX(0.0f);
            jh0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            return;
        }
        p0Var.setVisibility(8);
        p0Var.setAlpha(0.0f);
        p0Var.setScaleX(0.0f);
        p0Var.setScaleY(0.0f);
        if (this.s) {
            textView2.setVisibility(0);
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            jh0Var.setVisibility(4);
            jh0Var.setAlpha(0.0f);
            jh0Var.setScaleX(0.0f);
            jh0Var.setScaleY(0.0f);
            return;
        }
        jh0Var.setVisibility(0);
        jh0Var.setAlpha(1.0f);
        jh0Var.setScaleX(1.0f);
        jh0Var.setScaleY(1.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.0f);
        textView2.setScaleY(0.0f);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l10 = this.y;
            if (l10 == null || l10.longValue() != longValue) {
                return;
            }
            this.y = null;
            TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
            tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
            a(tL_stickerSetNoCovered, this.w, this.A, true);
        }
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.d;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.r;
    }

    public TextView getTextView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.x) {
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            this.x = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
        int measuredWidth = this.e.getMeasuredWidth();
        TextView textView = this.f;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = j3.r0.d(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
        } else {
            layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
        }
        measureChildWithMargins(this.b, i9, measuredWidth, i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
    }
}
