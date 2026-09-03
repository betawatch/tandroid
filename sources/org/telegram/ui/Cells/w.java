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
import org.telegram.ui.Components.fi0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.p9 d;
    public final fi0 e;
    public final fi0 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public v v;
    public boolean w;

    public w(Context context, boolean z4) {
        super(context);
        this.a = z4;
        if (z4) {
            fi0 fi0Var = new fi0(context);
            this.f = fi0Var;
            this.n = fi0Var;
            fi0Var.setText(LocaleController.getString(R.string.Add));
            fi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            fi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
            fi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
            addView(fi0Var, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int dp = AndroidUtilities.dp(60.0f);
            fi0 fi0Var2 = new fi0(context);
            this.e = fi0Var2;
            fi0Var2.setAllCaps(false);
            fi0Var2.setMinWidth(dp);
            fi0Var2.setMinimumWidth(dp);
            fi0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Rh;
            fi0Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            fi0Var2.setText(LocaleController.getString(R.string.StickersRemove));
            fi0Var2.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
            fi0Var2.setTypeface(AndroidUtilities.bold());
            k7.h6.a(fi0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            fi0Var2.setOutlineProvider(null);
            addView(fi0Var2, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            fi0Var.setOnClickListener(aVar);
            fi0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(k7.b6.y());
        addView(textView, k7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), 1, 13.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(k7.b6.y());
        addView(textView2, k7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        addView(p9Var, k7.b6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z4, boolean z10, boolean z11) {
        v vVar;
        int i10;
        if (!this.a || this.w == z4) {
            return;
        }
        this.w = z4;
        c(z10);
        if (!z11 || (vVar = this.v) == null) {
            return;
        }
        mg.w wVar = (mg.w) vVar;
        org.telegram.ui.r rVar = ((org.telegram.ui.q) wVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) wVar.c;
        a0.h hVar = rVar.a;
        if (z4) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            fi0 fi0Var = this.f;
            if (fi0Var != null) {
                fi0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i10 = ((org.telegram.ui.ActionBar.p2) rVar).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(rVar.getParentActivity(), stickerSetCovered, !z4 ? 1 : 2, rVar, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        TLRPC.Document document;
        this.h = z4;
        this.s = stickerSetCovered;
        setWillNotDraw(!z4);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z10 = stickerSet.emojis;
        TextView textView = this.c;
        if (z10) {
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
            org.telegram.ui.Components.p9 p9Var = this.d;
            if (document2 == null) {
                p9Var.i(null, null, "webp", null, stickerSetCovered);
                return;
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document2;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.j6.a7, 1.0f);
            boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z11 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, stickerSetCovered.set.thumb_version);
            if (z11 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2))) {
                if (svgThumb != null) {
                    p9Var.n(ImageLocation.getForDocument(document2), "50_50", svgThumb, stickerSetCovered);
                    return;
                } else {
                    p9Var.j(ImageLocation.getForDocument(document2), "50_50", forDocument, null, 0, stickerSetCovered);
                    return;
                }
            }
            if (forDocument == null || forDocument.imageType != 1) {
                p9Var.i(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                return;
            } else {
                p9Var.i(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                return;
            }
        }
        document = stickerSetCovered.cover;
        if (document == null) {
            if (!stickerSetCovered.covers.isEmpty()) {
                document2 = stickerSetCovered.covers.get(0);
            }
            org.telegram.ui.Components.p9 p9Var2 = this.d;
            if (document2 == null) {
            }
        }
        document2 = document;
        org.telegram.ui.Components.p9 p9Var22 = this.d;
        if (document2 == null) {
        }
    }

    public final void c(boolean z4) {
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z10 = this.w;
            float f10 = z10 ? 1.0f : 0.0f;
            float f11 = z10 ? 0.0f : 1.0f;
            fi0 fi0Var = this.f;
            fi0 fi0Var2 = this.e;
            if (!z4) {
                fi0Var2.setVisibility(z10 ? 0 : 4);
                fi0Var2.setAlpha(f10);
                fi0Var2.setScaleX(f10);
                fi0Var2.setScaleY(f10);
                fi0Var.setVisibility(this.w ? 4 : 0);
                fi0Var.setAlpha(f11);
                fi0Var.setScaleX(f11);
                fi0Var.setScaleY(f11);
                return;
            }
            this.n = z10 ? fi0Var2 : fi0Var;
            fi0Var.setVisibility(0);
            fi0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fi0Var2, (Property<fi0, Float>) property, f10);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fi0Var2, (Property<fi0, Float>) property2, f10);
            float[] fArr = {f10};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fi0Var2, (Property<fi0, Float>) property3, fArr), ObjectAnimator.ofFloat(fi0Var, (Property<fi0, Float>) property, f11), ObjectAnimator.ofFloat(fi0Var, (Property<fi0, Float>) property2, f11), ObjectAnimator.ofFloat(fi0Var, (Property<fi0, Float>) property3, f11));
            this.r.addListener(new org.telegram.ui.u5(this, r2));
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
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        a(z4, true, true);
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
