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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.w9 d;
    public final ii0 e;
    public final ii0 f;
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
            ii0 ii0Var = new ii0(context);
            this.f = ii0Var;
            this.n = ii0Var;
            ii0Var.setText(LocaleController.getString(R.string.Add));
            ii0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            ii0Var.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
            ii0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
            addView(ii0Var, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            ii0 ii0Var2 = new ii0(context);
            this.e = ii0Var2;
            ii0Var2.setAllCaps(false);
            ii0Var2.setMinWidth(dp);
            ii0Var2.setMinimumWidth(dp);
            ii0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.h6.Rh;
            ii0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            ii0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            ii0Var2.setBackground(org.telegram.ui.ActionBar.h6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
            ii0Var2.setTypeface(AndroidUtilities.bold());
            w7.e6.a(ii0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ii0Var2.setOutlineProvider(null);
            addView(ii0Var2, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ii0Var.setOnClickListener(aVar);
            ii0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        ok.t(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.y5.y());
        addView(textView, w7.y5.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        ok.t(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.y5.y());
        addView(textView2, w7.y5.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        addView(w9Var, w7.y5.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
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
        org.telegram.ui.o oVar = (org.telegram.ui.o) vVar;
        org.telegram.ui.q qVar = ((org.telegram.ui.p) oVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.c;
        a0.i iVar = qVar.a;
        if (z10) {
            a(false, false, false);
            if (iVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            ii0 ii0Var = this.f;
            if (ii0Var != null) {
                ii0Var.a(true, true);
            }
            iVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i10 = ((org.telegram.ui.ActionBar.m2) qVar).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(qVar.getParentActivity(), stickerSetCovered, !z10 ? 1 : 2, qVar, false, false);
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
            long j3 = stickerSetCovered.set.thumb_document_id;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    TLRPC.Document document3 = arrayList.get(i10);
                    if (document3 != null && document3.id == j3) {
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
            org.telegram.ui.Components.w9 w9Var = this.d;
            if (document2 == null) {
                w9Var.i(null, null, "webp", null, stickerSetCovered);
                return;
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document2;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.h6.a7, 1.0f);
            boolean z12 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z12 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, stickerSetCovered.set.thumb_version);
            if (z12 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2))) {
                if (svgThumb != null) {
                    w9Var.n(ImageLocation.getForDocument(document2), "50_50", svgThumb, stickerSetCovered);
                    return;
                } else {
                    w9Var.j(ImageLocation.getForDocument(document2), "50_50", forDocument, null, 0, stickerSetCovered);
                    return;
                }
            }
            if (forDocument == null || forDocument.imageType != 1) {
                w9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                return;
            } else {
                w9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                return;
            }
        }
        document = stickerSetCovered.cover;
        if (document == null) {
            if (!stickerSetCovered.covers.isEmpty()) {
                document2 = stickerSetCovered.covers.get(0);
            }
            org.telegram.ui.Components.w9 w9Var2 = this.d;
            if (document2 == null) {
            }
        }
        document2 = document;
        org.telegram.ui.Components.w9 w9Var22 = this.d;
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
            float f7 = z11 ? 1.0f : 0.0f;
            float f10 = z11 ? 0.0f : 1.0f;
            ii0 ii0Var = this.f;
            ii0 ii0Var2 = this.e;
            if (!z10) {
                ii0Var2.setVisibility(z11 ? 0 : 4);
                ii0Var2.setAlpha(f7);
                ii0Var2.setScaleX(f7);
                ii0Var2.setScaleY(f7);
                ii0Var.setVisibility(this.w ? 4 : 0);
                ii0Var.setAlpha(f10);
                ii0Var.setScaleX(f10);
                ii0Var.setScaleY(f10);
                return;
            }
            this.n = z11 ? ii0Var2 : ii0Var;
            ii0Var.setVisibility(0);
            ii0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ii0Var2, (Property<ii0, Float>) property, f7);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ii0Var2, (Property<ii0, Float>) property2, f7);
            float[] fArr = {f7};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ii0Var2, (Property<ii0, Float>) property3, fArr), ObjectAnimator.ofFloat(ii0Var, (Property<ii0, Float>) property, f10), ObjectAnimator.ofFloat(ii0Var, (Property<ii0, Float>) property2, f10), ObjectAnimator.ofFloat(ii0Var, (Property<ii0, Float>) property3, f10));
            this.r.addListener(new org.telegram.ui.t4(this, 5));
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
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.k0);
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
