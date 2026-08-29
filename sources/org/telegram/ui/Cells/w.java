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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.th0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.t9 d;
    public final th0 e;
    public final th0 f;
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
            th0 th0Var = new th0(context);
            this.f = th0Var;
            this.n = th0Var;
            th0Var.setText(LocaleController.getString(R.string.Add));
            th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
            th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
            addView(th0Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            th0 th0Var2 = new th0(context);
            this.e = th0Var2;
            th0Var2.setAllCaps(false);
            th0Var2.setMinWidth(dp);
            th0Var2.setMinimumWidth(dp);
            th0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.Rh;
            th0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            th0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            th0Var2.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
            th0Var2.setTypeface(AndroidUtilities.bold());
            i7.l6.a(th0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            th0Var2.setOutlineProvider(null);
            addView(th0Var2, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            th0Var.setOnClickListener(aVar);
            th0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(i7.f6.y());
        addView(textView, i7.f6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(i7.f6.y());
        addView(textView2, i7.f6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        t9Var.setAspectFit(true);
        t9Var.setLayerNum(1);
        addView(t9Var, i7.f6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        v vVar;
        int i10;
        if (!this.a || this.w == z10) {
            return;
        }
        this.w = z10;
        c(z11);
        if (!z12 || (vVar = this.v) == null) {
            return;
        }
        kg.w wVar = (kg.w) vVar;
        org.telegram.ui.r rVar = ((org.telegram.ui.q) wVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) wVar.c;
        a0.h hVar = rVar.a;
        if (z10) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            th0 th0Var = this.f;
            if (th0Var != null) {
                th0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i10 = ((org.telegram.ui.ActionBar.o2) rVar).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(rVar.getParentActivity(), stickerSetCovered, !z10 ? 1 : 2, rVar, false, false);
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
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    TLRPC.Document document3 = arrayList.get(i10);
                    if (document3 != null && document3.id == j10) {
                        document2 = document3;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            if (document2 == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
                document2 = document;
            }
            org.telegram.ui.Components.t9 t9Var = this.d;
            if (document2 == null) {
                t9Var.i(null, null, "webp", null, stickerSetCovered);
                return;
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document2;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.g6.a7, 1.0f);
            boolean z12 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z12 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, stickerSetCovered.set.thumb_version);
            if (z12 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2))) {
                if (svgThumb != null) {
                    t9Var.n(ImageLocation.getForDocument(document2), "50_50", svgThumb, stickerSetCovered);
                    return;
                } else {
                    t9Var.j(ImageLocation.getForDocument(document2), "50_50", forDocument, null, 0, stickerSetCovered);
                    return;
                }
            }
            if (forDocument == null || forDocument.imageType != 1) {
                t9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                return;
            } else {
                t9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                return;
            }
        }
        document = stickerSetCovered.cover;
        if (document == null) {
            if (!stickerSetCovered.covers.isEmpty()) {
                document2 = stickerSetCovered.covers.get(0);
            }
            org.telegram.ui.Components.t9 t9Var2 = this.d;
            if (document2 == null) {
            }
        }
        document2 = document;
        org.telegram.ui.Components.t9 t9Var22 = this.d;
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
            float f9 = z11 ? 1.0f : 0.0f;
            float f10 = z11 ? 0.0f : 1.0f;
            th0 th0Var = this.f;
            th0 th0Var2 = this.e;
            if (!z10) {
                th0Var2.setVisibility(z11 ? 0 : 4);
                th0Var2.setAlpha(f9);
                th0Var2.setScaleX(f9);
                th0Var2.setScaleY(f9);
                th0Var.setVisibility(this.w ? 4 : 0);
                th0Var.setAlpha(f10);
                th0Var.setScaleX(f10);
                th0Var.setScaleY(f10);
                return;
            }
            this.n = z11 ? th0Var2 : th0Var;
            th0Var.setVisibility(0);
            th0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(th0Var2, (Property<th0, Float>) property, f9);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(th0Var2, (Property<th0, Float>) property2, f9);
            float[] fArr = {f9};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(th0Var2, (Property<th0, Float>) property3, fArr), ObjectAnimator.ofFloat(th0Var, (Property<th0, Float>) property, f10), ObjectAnimator.ofFloat(th0Var, (Property<th0, Float>) property2, f10), ObjectAnimator.ofFloat(th0Var, (Property<th0, Float>) property3, f10));
            this.r.addListener(new nh.q5(this, 13));
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
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.a && view == this.b) {
            i11 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
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
