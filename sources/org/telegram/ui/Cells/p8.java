package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
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
import bi.md;
import java.util.ArrayList;
import java.util.HashSet;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p8 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView E;
    public final tg.p0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int a;
    public final md b;
    public final TextView c;
    public final org.telegram.ui.Components.y9 d;
    public final aq e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect v;
    public boolean w;
    public final FrameLayout x;
    public final TextView y;

    public p8(Context context, int i10) {
        super(context);
        this.v = new Rect();
        this.a = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        addView(y9Var, kb1.h(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 13.0f, 9.0f, z10 ? 13.0f : 0.0f, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                int i11 = org.telegram.ui.ActionBar.y6.Vh;
                y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 1, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                imageView.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
            }
            if (i10 == 1) {
                int i12 = org.telegram.ui.ActionBar.y6.Uh;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.f7.t(imageView, i12, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                addView(imageView, kb1.i(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                org.telegram.ui.ActionBar.f7.t(imageView2, i12, null, mode);
                addView(imageView2, kb1.l(58.0f, 58.0f, 8388613));
                aq aqVar = new aq(context, 21, null);
                this.e = aqVar;
                aqVar.b(-1, org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.k7);
                aqVar.setDrawUnchecked(false);
                aqVar.setDrawBackgroundAsArc(3);
                addView(aqVar, kb1.m(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Mh, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                addView(imageView, kb1.h(40, 40.0f, (z11 ? 3 : 5) | 48, z11 ? 10 : 0, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        TextView textView = new TextView(context);
        this.y = textView;
        ic.a.o(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.y6.Qh;
        y d = org.telegram.ui.ActionBar.o6.d(new float[]{14.0f}, x02, org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i14);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.f7.k(textView, d, N2, N3, null);
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new j8(this, 0));
        frameLayout.addView(textView, kb1.l(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        kb1.b(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        ic.a.o(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Rh, null);
        y d10 = org.telegram.ui.ActionBar.o6.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.y6.x0(null, i13, false) & 452984831);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i13, 26);
        textView2.setBackground(d10);
        org.telegram.ui.ActionBar.f7.k(textView2, d10, null, h, null);
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new j8(this, 0));
        frameLayout.addView(textView2, kb1.m(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        kb1.b(textView2);
        tg.p0 p0Var = new tg.p0(AndroidUtilities.dp(4.0f), context, null, false);
        this.F = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new j8(this, 0), false);
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
        this.x.addView(this.F, kb1.l(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        kb1.b(this.F);
        this.x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.x, kb1.h(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x.setOnClickListener(new j8(this, 1));
        md mdVar = new md(context, 9);
        this.b = mdVar;
        NotificationCenter.listenEmojiLoading(mdVar);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.G6, null);
        mdVar.setTextSize(1, 16.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setLines(1);
        mdVar.setMaxLines(1);
        mdVar.setSingleLine(true);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setGravity(kb1.E());
        addView(mdVar, kb1.m(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.z6, null);
        wh.r(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(kb1.E());
        addView(textView3, kb1.m(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.y6, null, PorterDuff.Mode.SRC_IN);
            int i15 = org.telegram.ui.ActionBar.y6.i6;
            y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 1, -1);
            org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i15);
            imageView3.setBackground(g03);
            org.telegram.ui.ActionBar.f7.k(imageView3, g03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            addView(imageView3, kb1.h(-2, -2.0f, (z12 ? 3 : 5) | 16, z12 ? 4.0f : 0.0f, 0.0f, z12 ? 0.0f : 4.0f, 0.0f));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
    }

    public final void b(boolean z10, boolean z11) {
        int i10 = this.a;
        if (i10 == 1) {
            this.e.a(z10, z11);
            return;
        }
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                imageView.animate().setListener(new m8(this, z10, 0)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z10 ? 0 : 4);
            if (z10) {
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
            if (z11) {
                frameLayout.animate().cancel();
                frameLayout.animate().setListener(new m8(this, z10, 1)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z10 ? 0 : 4);
            if (z10) {
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

    public final void c(final boolean z10) {
        final int i10 = 1;
        if (this.a == 1) {
            final int i11 = 2;
            final int i12 = 0;
            float[] fArr = {z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f};
            float[] fArr2 = {z10 ? 1.0f : 0.66f, z10 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            ds dsVar = ut.a;
            duration.setInterpolator(dsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.k8
                public final /* synthetic */ p8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            boolean z11 = z10;
                            p8 p8Var = this.b;
                            if (!z11) {
                                p8Var.n.setVisibility(8);
                                break;
                            } else {
                                p8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z12 = z10;
                            p8 p8Var2 = this.b;
                            if (!z12) {
                                p8Var2.getClass();
                                break;
                            } else {
                                p8Var2.x.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z13 = z10;
                            p8 p8Var3 = this.b;
                            if (!z13) {
                                p8Var3.getClass();
                                break;
                            } else {
                                p8Var3.h.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            if (this.w) {
                FrameLayout frameLayout = this.x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(dsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.k8
                    public final /* synthetic */ p8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                p8 p8Var = this.b;
                                if (!z11) {
                                    p8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    p8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                p8 p8Var2 = this.b;
                                if (!z12) {
                                    p8Var2.getClass();
                                    break;
                                } else {
                                    p8Var2.x.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                p8 p8Var3 = this.b;
                                if (!z13) {
                                    p8Var3.getClass();
                                    break;
                                } else {
                                    p8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(dsVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.k8
                    public final /* synthetic */ p8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z11 = z10;
                                p8 p8Var = this.b;
                                if (!z11) {
                                    p8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    p8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                p8 p8Var2 = this.b;
                                if (!z12) {
                                    p8Var2.getClass();
                                    break;
                                } else {
                                    p8Var2.x.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                p8 p8Var3 = this.b;
                                if (!z13) {
                                    p8Var3.getClass();
                                    break;
                                } else {
                                    p8Var3.h.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
            }
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        this.f = z10;
        this.r = tL_messages_stickerSet;
        this.s = z11;
        org.telegram.ui.Components.y9 y9Var = this.d;
        y9Var.setVisibility(0);
        md mdVar = this.b;
        mdVar.setTranslationY(0.0f);
        mdVar.setText(this.r.set.title);
        boolean z12 = this.r.set.archived;
        TextView textView = this.c;
        if (z12) {
            mdVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            y9Var.setAlpha(0.5f);
        } else {
            mdVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            y9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.w = z13;
        this.x.setVisibility(z13 ? 0 : 8);
        this.h.setVisibility(this.w ? 8 : 0);
        TLRPC.Document document = null;
        y9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(LocaleController.formatPluralString(tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            y9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.t5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.q5() { // from class: org.telegram.ui.Cells.l8
                    @Override // org.telegram.ui.Components.q5
                    public final void a(TLRPC.Document document2) {
                        AndroidUtilities.runOnUIThread(new pa(7, p8.this, document2));
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.y6.a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z14 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!LiteMode.isEnabled(this.w ? LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD : 1) ? "_firstframe" : "");
            if (z14 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    y9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    y9Var.j(ImageLocation.getForDocument(document), concat, forDocument, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    y9Var.setColorFilter(org.telegram.ui.ActionBar.y6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forDocument == null || forDocument.imageType != 1) {
                    y9Var.i(forDocument, concat, "webp", svgThumb, tL_messages_stickerSet2);
                } else {
                    y9Var.i(forDocument, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                }
            }
        }
        if (this.s) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_messages_stickerSet2.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i10) {
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        tg.p0 p0Var = this.F;
        if (i10 == 1) {
            p0Var.a(LocaleController.getString(R.string.Unlock), new j8(this, 0), false);
        } else if (i10 == 2) {
            p0Var.a(LocaleController.getString(R.string.Restore), new j8(this, 0), false);
        }
        p0Var.setEnabled(i10 == 1 || i10 == 2);
        boolean z10 = i10 == 3;
        TextView textView = this.y;
        textView.setEnabled(z10);
        boolean z11 = i10 == 4;
        TextView textView2 = this.E;
        textView2.setEnabled(z11);
        p0Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
        p0Var.setScaleX((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        p0Var.setScaleY((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        p0Var.setVisibility((i10 == 1 || i10 == 2) ? 0 : 8);
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
        boolean z12 = LocaleController.isRTL;
        TextView textView3 = this.c;
        md mdVar = this.b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        aq aqVar = this.e;
        if (aqVar == null || !aqVar.a.q) {
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

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f = z10;
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

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
    }
}
