package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k8 extends FrameLayout {
    public final TextView B;
    public final fg.b1 C;
    public final ImageView D;
    public AnimatorSet E;
    public final int a;
    public final hg.q b;
    public final TextView c;
    public final org.telegram.ui.Components.p9 d;
    public final np e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect v;
    public boolean w;
    public final FrameLayout x;
    public final TextView y;

    public k8(Context context, int i10) {
        super(context);
        this.v = new Rect();
        this.a = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        boolean z4 = LocaleController.isRTL;
        addView(p9Var, k7.c6.d(40, 40.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 13.0f, 9.0f, z4 ? 13.0f : 0.0f, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Vh, false), 1, -1));
            }
            if (i10 == 1) {
                int i11 = org.telegram.ui.ActionBar.k6.Uh;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                addView(imageView, k7.c6.e(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), mode));
                addView(imageView2, k7.c6.h(58.0f, 58.0f, 8388613));
                np npVar = new np(context, 21, null);
                this.e = npVar;
                npVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                npVar.setDrawUnchecked(false);
                npVar.setDrawBackgroundAsArc(3);
                addView(npVar, k7.c6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z10 = LocaleController.isRTL;
                addView(imageView, k7.c6.d(40, 40.0f, (z10 ? 3 : 5) | 48, z10 ? 10 : 0, 9.0f, z10 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        TextView textView = new TextView(context);
        this.y = textView;
        yh.p(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{14.0f}, org.telegram.ui.ActionBar.k6.w0(null, i12, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new e8(this, 0));
        frameLayout.addView(textView, k7.c6.h(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        k7.e6.a(textView);
        TextView textView2 = new TextView(context);
        this.B = textView2;
        yh.p(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.k6.w0(null, i12, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new e8(this, 0));
        frameLayout.addView(textView2, k7.c6.i(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        k7.e6.a(textView2);
        fg.b1 b1Var = new fg.b1(AndroidUtilities.dp(4.0f), context, null, false);
        this.C = b1Var;
        b1Var.setIcon(R.raw.unlock_icon);
        b1Var.a(LocaleController.getString(R.string.Unlock), new e8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) b1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            b1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.x.addView(this.C, k7.c6.h(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        k7.e6.a(this.C);
        this.x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.x, k7.c6.d(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x.setOnClickListener(new e8(this, 1));
        hg.q qVar = new hg.q(context, 7);
        this.b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        qVar.setTextSize(1, 16.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setLines(1);
        qVar.setMaxLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setGravity(k7.c6.y());
        addView(qVar, k7.c6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.b.q(textView3, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(k7.c6.y());
        addView(textView3, k7.c6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.D = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z11 = LocaleController.isRTL;
            addView(imageView3, k7.c6.d(-2, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 4.0f : 0.0f, 0.0f, z11 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.a;
        if (i10 == 1) {
            return this.e.a.q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.w || this.x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z4, boolean z10) {
        int i10 = this.a;
        if (i10 == 1) {
            this.e.a(z4, z10);
            return;
        }
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z10) {
                imageView.animate().cancel();
                imageView.animate().setListener(new h8(this, z4, 0)).alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.1f).scaleY(z4 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z4 ? 0 : 4);
            if (z4) {
                imageView.setAlpha(1.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                return;
            } else {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
        }
        if (this.w) {
            FrameLayout frameLayout = this.x;
            if (z10) {
                frameLayout.animate().cancel();
                frameLayout.animate().setListener(new h8(this, z4, 1)).alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.1f).scaleY(z4 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z4 ? 0 : 4);
            if (z4) {
                frameLayout.setAlpha(1.0f);
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(1.0f);
            } else {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
            }
        }
    }

    public final void c(final boolean z4) {
        final int i10 = 1;
        if (this.a == 1) {
            final int i11 = 2;
            final int i12 = 0;
            float[] fArr = {z4 ? 1.0f : 0.0f, z4 ? 0.0f : 1.0f};
            float[] fArr2 = {z4 ? 1.0f : 0.66f, z4 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            pr prVar = jt.a;
            duration.setInterpolator(prVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                public final /* synthetic */ k8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            boolean z10 = z4;
                            k8 k8Var = this.b;
                            if (!z10) {
                                k8Var.n.setVisibility(8);
                                break;
                            } else {
                                k8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z11 = z4;
                            k8 k8Var2 = this.b;
                            if (!z11) {
                                k8Var2.getClass();
                                break;
                            } else {
                                k8Var2.x.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z12 = z4;
                            k8 k8Var3 = this.b;
                            if (!z12) {
                                k8Var3.getClass();
                                break;
                            } else {
                                k8Var3.h.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            if (this.w) {
                FrameLayout frameLayout = this.x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(prVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                    public final /* synthetic */ k8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = z4;
                                k8 k8Var = this.b;
                                if (!z10) {
                                    k8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    k8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z11 = z4;
                                k8 k8Var2 = this.b;
                                if (!z11) {
                                    k8Var2.getClass();
                                    break;
                                } else {
                                    k8Var2.x.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z12 = z4;
                                k8 k8Var3 = this.b;
                                if (!z12) {
                                    k8Var3.getClass();
                                    break;
                                } else {
                                    k8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(prVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                    public final /* synthetic */ k8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = z4;
                                k8 k8Var = this.b;
                                if (!z10) {
                                    k8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    k8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z11 = z4;
                                k8 k8Var2 = this.b;
                                if (!z11) {
                                    k8Var2.getClass();
                                    break;
                                } else {
                                    k8Var2.x.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z12 = z4;
                                k8 k8Var3 = this.b;
                                if (!z12) {
                                    k8Var3.getClass();
                                    break;
                                } else {
                                    k8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            }
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z4, boolean z10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        this.f = z4;
        this.r = tL_messages_stickerSet;
        this.s = z10;
        org.telegram.ui.Components.p9 p9Var = this.d;
        p9Var.setVisibility(0);
        hg.q qVar = this.b;
        qVar.setTranslationY(0.0f);
        qVar.setText(this.r.set.title);
        boolean z11 = this.r.set.archived;
        TextView textView = this.c;
        if (z11) {
            qVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            p9Var.setAlpha(0.5f);
        } else {
            qVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            p9Var.setAlpha(1.0f);
        }
        boolean z12 = tL_messages_stickerSet.set.emojis;
        this.w = z12;
        this.x.setVisibility(z12 ? 0 : 8);
        this.h.setVisibility(this.w ? 8 : 0);
        TLRPC.Document document = null;
        p9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(LocaleController.formatPluralString(tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            p9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.l5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.i5() { // from class: org.telegram.ui.Cells.g8
                    @Override // org.telegram.ui.Components.i5
                    public final void a(TLRPC.Document document2) {
                        AndroidUtilities.runOnUIThread(new ja(7, k8.this, document2));
                    }
                });
            }
        } else {
            textView.setText(LocaleController.formatPluralString(this.w ? "EmojiCount" : "Stickers", arrayList.size(), new Object[0]));
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i10);
                    if (document2 != null && document2.id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f);
            boolean z13 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z13 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!LiteMode.isEnabled(this.w ? LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD : 1) ? "_firstframe" : "");
            if (z13 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    p9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    p9Var.j(ImageLocation.getForDocument(document), concat, forDocument, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    p9Var.setColorFilter(org.telegram.ui.ActionBar.k6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forDocument == null || forDocument.imageType != 1) {
                    p9Var.i(forDocument, concat, "webp", svgThumb, tL_messages_stickerSet2);
                } else {
                    p9Var.i(forDocument, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                }
            }
        }
        if (this.s) {
            StringBuilder sb = new StringBuilder();
            sb.append(tL_messages_stickerSet2.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb.toString());
        }
    }

    public final void e(int i10) {
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.E = null;
        }
        fg.b1 b1Var = this.C;
        if (i10 == 1) {
            b1Var.a(LocaleController.getString(R.string.Unlock), new e8(this, 0), false);
        } else if (i10 == 2) {
            b1Var.a(LocaleController.getString(R.string.Restore), new e8(this, 0), false);
        }
        b1Var.setEnabled(i10 == 1 || i10 == 2);
        boolean z4 = i10 == 3;
        TextView textView = this.y;
        textView.setEnabled(z4);
        boolean z10 = i10 == 4;
        TextView textView2 = this.B;
        textView2.setEnabled(z10);
        b1Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
        b1Var.setScaleX((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        b1Var.setScaleY((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        b1Var.setVisibility((i10 == 1 || i10 == 2) ? 0 : 8);
        textView.setAlpha(i10 == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i10 == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i10 == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i10 == 3 ? 0 : 8);
        textView2.setAlpha(i10 == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i10 == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i10 != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i10 != 4 ? 8 : 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30);
        FrameLayout frameLayout = this.x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z11 = LocaleController.isRTL;
        TextView textView3 = this.c;
        hg.q qVar = this.b;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) qVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) qVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        np npVar = this.e;
        if (npVar == null || !npVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.v;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.w && (frameLayout = this.x) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z4) {
        b(z4, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z4) {
        this.f = z4;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z4) {
        c(z4);
    }
}
