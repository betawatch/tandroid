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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k8 extends FrameLayout {
    public final TextView A;
    public final zf.p0 B;
    public final ImageView C;
    public AnimatorSet D;
    public final int a;
    public final bg.t b;
    public final TextView c;
    public final org.telegram.ui.Components.o9 d;
    public final dp e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect v;
    public boolean w;
    public final FrameLayout x;
    public final TextView y;

    public k8(Context context, int i9) {
        super(context);
        this.v = new Rect();
        this.a = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 13.0f, 9.0f, z10 ? 13.0f : 0.0f, 0.0f));
        if (i9 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i9 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vh, false), 1, -1));
            }
            if (i9 == 1) {
                int i10 = org.telegram.ui.ActionBar.f6.Uh;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                addView(imageView, g7.e6.e(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), mode));
                addView(imageView2, g7.e6.h(58.0f, 58.0f, 8388613));
                dp dpVar = new dp(context, 21, null);
                this.e = dpVar;
                dpVar.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
                dpVar.setDrawUnchecked(false);
                dpVar.setDrawBackgroundAsArc(3);
                addView(dpVar, g7.e6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i9 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                addView(imageView, g7.e6.d(40, 40.0f, (z11 ? 3 : 5) | 48, z11 ? 10 : 0, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        TextView textView = new TextView(context);
        this.y = textView;
        j3.r0.u(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{14.0f}, org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new e8(this, 0));
        frameLayout.addView(textView, g7.e6.h(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        g7.g6.a(textView);
        TextView textView2 = new TextView(context);
        this.A = textView2;
        j3.r0.u(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.f6.w0(null, i11, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new e8(this, 0));
        frameLayout.addView(textView2, g7.e6.i(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        g7.g6.a(textView2);
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(4.0f), context, null, false);
        this.B = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new e8(this, 0), false);
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
        this.x.addView(this.B, g7.e6.h(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        g7.g6.a(this.B);
        this.x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.x, g7.e6.d(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x.setOnClickListener(new e8(this, 1));
        bg.t tVar = new bg.t(context, 9);
        this.b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        tVar.setTextSize(1, 16.0f);
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setLines(1);
        tVar.setMaxLines(1);
        tVar.setSingleLine(true);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        tVar.setGravity(g7.e6.y());
        addView(tVar, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        ll.s(textView3, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(g7.e6.y());
        addView(textView3, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i9 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.C = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            addView(imageView3, g7.e6.d(-2, -2.0f, (z12 ? 3 : 5) | 16, z12 ? 4.0f : 0.0f, 0.0f, z12 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i9 = this.a;
        if (i9 == 1) {
            return this.e.a.q;
        }
        if (i9 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.w || this.x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10, boolean z11) {
        int i9 = this.a;
        if (i9 == 1) {
            this.e.a(z10, z11);
            return;
        }
        if (i9 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                imageView.animate().setListener(new h8(this, z10, 0)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
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
                frameLayout.animate().setListener(new h8(this, z10, 1)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
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
        final int i9 = 1;
        if (this.a == 1) {
            final int i10 = 2;
            final int i11 = 0;
            float[] fArr = {z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f};
            float[] fArr2 = {z10 ? 1.0f : 0.66f, z10 ? 0.66f : 1.0f};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            gr grVar = xs.a;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                public final /* synthetic */ k8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            boolean z11 = z10;
                            k8 k8Var = this.b;
                            if (!z11) {
                                k8Var.n.setVisibility(8);
                                break;
                            } else {
                                k8Var.getClass();
                                break;
                            }
                        case 1:
                            boolean z12 = z10;
                            k8 k8Var2 = this.b;
                            if (!z12) {
                                k8Var2.getClass();
                                break;
                            } else {
                                k8Var2.x.setVisibility(8);
                                break;
                            }
                        default:
                            boolean z13 = z10;
                            k8 k8Var3 = this.b;
                            if (!z13) {
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
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                    public final /* synthetic */ k8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                boolean z11 = z10;
                                k8 k8Var = this.b;
                                if (!z11) {
                                    k8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    k8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                k8 k8Var2 = this.b;
                                if (!z12) {
                                    k8Var2.getClass();
                                    break;
                                } else {
                                    k8Var2.x.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                k8 k8Var3 = this.b;
                                if (!z13) {
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
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Cells.f8
                    public final /* synthetic */ k8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                k8 k8Var = this.b;
                                if (!z11) {
                                    k8Var.n.setVisibility(8);
                                    break;
                                } else {
                                    k8Var.getClass();
                                    break;
                                }
                            case 1:
                                boolean z12 = z10;
                                k8 k8Var2 = this.b;
                                if (!z12) {
                                    k8Var2.getClass();
                                    break;
                                } else {
                                    k8Var2.x.setVisibility(8);
                                    break;
                                }
                            default:
                                boolean z13 = z10;
                                k8 k8Var3 = this.b;
                                if (!z13) {
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

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        this.f = z10;
        this.r = tL_messages_stickerSet;
        this.s = z11;
        org.telegram.ui.Components.o9 o9Var = this.d;
        o9Var.setVisibility(0);
        bg.t tVar = this.b;
        tVar.setTranslationY(0.0f);
        tVar.setText(this.r.set.title);
        boolean z12 = this.r.set.archived;
        TextView textView = this.c;
        if (z12) {
            tVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            o9Var.setAlpha(0.5f);
        } else {
            tVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            o9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.w = z13;
        this.x.setVisibility(z13 ? 0 : 8);
        this.h.setVisibility(this.w ? 8 : 0);
        TLRPC.Document document = null;
        o9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(LocaleController.formatPluralString(tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            o9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.k5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.h5() { // from class: org.telegram.ui.Cells.g8
                    @Override // org.telegram.ui.Components.h5
                    public final void a(TLRPC.Document document2) {
                        AndroidUtilities.runOnUIThread(new ka(7, k8.this, document2));
                    }
                });
            }
        } else {
            textView.setText(LocaleController.formatPluralString(this.w ? "EmojiCount" : "Stickers", arrayList.size(), new Object[0]));
            int i9 = 0;
            while (true) {
                if (i9 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i9);
                    if (document2 != null && document2.id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i9++;
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.f6.a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z14 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!LiteMode.isEnabled(this.w ? LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD : 1) ? "_firstframe" : "");
            if (z14 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    o9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    o9Var.j(ImageLocation.getForDocument(document), concat, forDocument, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    o9Var.setColorFilter(org.telegram.ui.ActionBar.f6.v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forDocument == null || forDocument.imageType != 1) {
                    o9Var.i(forDocument, concat, "webp", svgThumb, tL_messages_stickerSet2);
                } else {
                    o9Var.i(forDocument, concat, "tgs", svgThumb, tL_messages_stickerSet2);
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

    public final void e(int i9) {
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.D = null;
        }
        zf.p0 p0Var = this.B;
        if (i9 == 1) {
            p0Var.a(LocaleController.getString(R.string.Unlock), new e8(this, 0), false);
        } else if (i9 == 2) {
            p0Var.a(LocaleController.getString(R.string.Restore), new e8(this, 0), false);
        }
        p0Var.setEnabled(i9 == 1 || i9 == 2);
        boolean z10 = i9 == 3;
        TextView textView = this.y;
        textView.setEnabled(z10);
        boolean z11 = i9 == 4;
        TextView textView2 = this.A;
        textView2.setEnabled(z11);
        p0Var.setAlpha((i9 == 1 || i9 == 2) ? 1.0f : 0.0f);
        p0Var.setScaleX((i9 == 1 || i9 == 2) ? 1.0f : 0.6f);
        p0Var.setScaleY((i9 == 1 || i9 == 2) ? 1.0f : 0.6f);
        p0Var.setVisibility((i9 == 1 || i9 == 2) ? 0 : 8);
        textView.setAlpha(i9 == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i9 == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i9 == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i9 == 3 ? 0 : 8);
        textView2.setAlpha(i9 == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i9 == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i9 != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i9 != 4 ? 8 : 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30);
        FrameLayout frameLayout = this.x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z12 = LocaleController.isRTL;
        TextView textView3 = this.c;
        bg.t tVar = this.b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) tVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) tVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dp dpVar = this.e;
        if (dpVar == null || !dpVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
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
        ImageView imageView = this.C;
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
}
