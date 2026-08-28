package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Checkable;
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
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.o9 d;
    public final jh0 e;
    public final jh0 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public v v;
    public boolean w;

    public w(Context context, boolean z10) {
        super(context);
        this.a = z10;
        if (z10) {
            jh0 jh0Var = new jh0(context);
            this.f = jh0Var;
            this.n = jh0Var;
            jh0Var.setText(LocaleController.getString(R.string.Add));
            jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
            jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, w02));
            addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            jh0 jh0Var2 = new jh0(context);
            this.e = jh0Var2;
            jh0Var2.setAllCaps(false);
            jh0Var2.setMinWidth(dp);
            jh0Var2.setMinimumWidth(dp);
            jh0Var2.setTextSize(1, 14.0f);
            int i9 = org.telegram.ui.ActionBar.f6.Rh;
            jh0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            jh0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            jh0Var2.setBackground(org.telegram.ui.ActionBar.f6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
            jh0Var2.setTypeface(AndroidUtilities.bold());
            g7.k6.a(jh0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            jh0Var2.setOutlineProvider(null);
            addView(jh0Var2, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            jh0Var.setOnClickListener(aVar);
            jh0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(g7.e6.y());
        addView(textView, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(g7.e6.y());
        addView(textView2, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setLayerNum(1);
        addView(o9Var, g7.e6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i9;
        if (!this.a || this.w == z10) {
            return;
        }
        this.w = z10;
        c(z11);
        if (!z12 || (vVar = this.v) == null) {
            return;
        }
        ih.v3 v3Var = (ih.v3) vVar;
        org.telegram.ui.p pVar = ((org.telegram.ui.o) v3Var.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) v3Var.c;
        a0.h hVar = pVar.a;
        if (z10) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            jh0 jh0Var = this.f;
            if (jh0Var != null) {
                jh0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i9 = ((org.telegram.ui.ActionBar.o2) pVar).currentAccount;
        MediaDataController.getInstance(i9).toggleStickerSet(pVar.getParentActivity(), stickerSetCovered, !z10 ? 1 : 2, pVar, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        TLRPC.Document document;
        this.h = z10;
        this.s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.c;
        if (z11) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        TLRPC.Document document2 = null;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j10 = stickerSetCovered.set.thumb_document_id;
            int i9 = 0;
            while (true) {
                if (i9 < arrayList.size()) {
                    TLRPC.Document document3 = arrayList.get(i9);
                    if (document3 != null && document3.id == j10) {
                        document2 = document3;
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            if (document2 == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
                document2 = document;
            }
            org.telegram.ui.Components.o9 o9Var = this.d;
            if (document2 == null) {
                o9Var.i(null, null, "webp", null, stickerSetCovered);
                return;
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document2;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.f6.a7, 1.0f);
            boolean z12 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z12 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, stickerSetCovered.set.thumb_version);
            if (z12 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2))) {
                if (svgThumb != null) {
                    o9Var.n(ImageLocation.getForDocument(document2), "50_50", svgThumb, stickerSetCovered);
                    return;
                } else {
                    o9Var.j(ImageLocation.getForDocument(document2), "50_50", forDocument, null, 0, stickerSetCovered);
                    return;
                }
            }
            if (forDocument == null || forDocument.imageType != 1) {
                o9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                return;
            } else {
                o9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                return;
            }
        }
        document = stickerSetCovered.cover;
        if (document == null) {
            if (!stickerSetCovered.covers.isEmpty()) {
                document2 = stickerSetCovered.covers.get(0);
            }
            org.telegram.ui.Components.o9 o9Var2 = this.d;
            if (document2 == null) {
            }
        }
        document2 = document;
        org.telegram.ui.Components.o9 o9Var22 = this.d;
        if (document2 == null) {
        }
    }

    public final void c(boolean z10) {
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.w;
            float f10 = z11 ? 1.0f : 0.0f;
            float f11 = z11 ? 0.0f : 1.0f;
            jh0 jh0Var = this.f;
            jh0 jh0Var2 = this.e;
            if (!z10) {
                jh0Var2.setVisibility(z11 ? 0 : 4);
                jh0Var2.setAlpha(f10);
                jh0Var2.setScaleX(f10);
                jh0Var2.setScaleY(f10);
                jh0Var.setVisibility(this.w ? 4 : 0);
                jh0Var.setAlpha(f11);
                jh0Var.setScaleX(f11);
                jh0Var.setScaleY(f11);
                return;
            }
            this.n = z11 ? jh0Var2 : jh0Var;
            jh0Var.setVisibility(0);
            jh0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jh0Var2, (Property<jh0, Float>) property, f10);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jh0Var2, (Property<jh0, Float>) property2, f10);
            float[] fArr = {f10};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jh0Var2, (Property<jh0, Float>) property3, fArr), ObjectAnimator.ofFloat(jh0Var, (Property<jh0, Float>) property, f11), ObjectAnimator.ofFloat(jh0Var, (Property<jh0, Float>) property2, f11), ObjectAnimator.ofFloat(jh0Var, (Property<jh0, Float>) property3, f11));
            this.r.addListener(new mh.x(this, 11));
            this.r.setInterpolator(new OvershootInterpolator(1.02f));
            this.r.start();
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.s;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        if (this.a && view == this.b) {
            i10 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i9, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(v vVar) {
        this.v = vVar;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.a) {
            setChecked(!this.w);
        }
    }
}
